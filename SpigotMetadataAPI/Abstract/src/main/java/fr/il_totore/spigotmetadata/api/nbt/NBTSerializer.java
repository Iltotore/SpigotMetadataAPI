package fr.il_totore.spigotmetadata.api.nbt;

import com.google.common.primitives.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public interface NBTSerializer<T extends NBTBase> {

    T read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException;

    void write(NBTManager nbtManager, NBTOutputStream outputStream, T nbt) throws IOException;


    class EndSerializer implements NBTSerializer<NBTTagEnd> {

        @Override
        public NBTTagEnd read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {
            return nbtManager.of(NBTTagType.END);
        }

        @Override
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTTagEnd nbt) throws IOException {
            //Nothing
        }
    }

    class SimpleValueSerializer<T> implements NBTSerializer<NBTSingleValue<T>> {

        private NBTTagType<? extends NBTSingleValue<T>> type;
        private Function<NBTInputStream, T> readMethod;
        private BiConsumer<NBTOutputStream, T> writeMethod;

        public SimpleValueSerializer(NBTTagType<? extends NBTSingleValue<T>> type, Function<NBTInputStream, T> readMethod, BiConsumer<NBTOutputStream, T> writeMethod) {
            this.type = type;
            this.readMethod = readMethod;
            this.writeMethod = writeMethod;
        }

        @Override
        public NBTSingleValue<T> read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {
            return nbtManager.of(type, readMethod.apply(inputStream));
        }

        @Override
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTSingleValue<T> nbt) throws IOException {
            writeMethod.accept(outputStream, nbt.get());
        }
    }


    class ByteArraySerializer implements NBTSerializer<NBTSingleValue<List<Byte>>> {

        @Override
        public NBTSingleValue<List<Byte>> read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {
            byte[] data = new byte[inputStream.readByte()];
            inputStream.readFully(data);

            return nbtManager.of(NBTTagType.BYTE_ARRAY, data);
        }

        @Override
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTSingleValue<List<Byte>> nbt) throws IOException {
            outputStream.writeInt(nbt.get().size());
            outputStream.write(Bytes.toArray(nbt.get()));
        }
    }

    class IntArraySerializer implements NBTSerializer<NBTSingleValue<List<Integer>>> {

        @Override
        public NBTSingleValue<List<Integer>> read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {

            int size = inputStream.readInt();

            int[] data = new int[size];

            for(int i = 0; i < size; i++) {
                data[i] = inputStream.readInt();
            }

            return nbtManager.of(NBTTagType.INT_ARRAY, data);
        }

        @Override
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTSingleValue<List<Integer>> nbt) throws IOException {
            outputStream.writeInt(nbt.get().size());
            for(int i : nbt.get()) outputStream.writeInt(i);
        }
    }

    class ListSerializer implements NBTSerializer<NBTTagList> {

        @Override
        public NBTTagList read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {
            List<NBTBase> values = new ArrayList<>();
            NBTTagType<?> valueType = NBTTagType.getById(inputStream.readByte());
            int size = inputStream.readInt();

            if(valueType == NBTTagType.END) return nbtManager.of(NBTTagType.LIST, new ArrayList<>());
            if(valueType == null) throw new IOException("Unable to resolve value type !");

            for(int i = 0; i < size; i++) {
                NBTBase nbtBase = inputStream.readTag(valueType);
                values.add(nbtBase);
            }

            return nbtManager.of(NBTTagType.LIST, values);
        }

        @Override
        @SuppressWarnings("unchecked")
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTTagList nbt) throws IOException {
            NBTTagType valueType = nbt.getValueType();
            NBTSerializer serializer = nbtManager.getSerializer(valueType);
            outputStream.writeByte(valueType.getId());
            outputStream.writeInt(nbt.size());

            for(NBTBase nbtBase : nbt.getTags(nbtManager)) {
                serializer.write(nbtManager, outputStream, nbtBase);
            }
        }
    }

    class CompoundSerializer implements NBTSerializer<NBTTagCompound> {

        @Override
        public NBTTagCompound read(NBTManager nbtManager, NBTInputStream inputStream) throws IOException {
            NBTTagCompound nbtTagCompound = nbtManager.of(NBTTagType.COMPOUND);
            NamedNBT<?> namedNBT = inputStream.readNamedTag();
            while(namedNBT != null) {
                nbtTagCompound.setTag(namedNBT.getName(), namedNBT.getValue());
                namedNBT = inputStream.readNamedTag();
            }
            return nbtTagCompound;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void write(NBTManager nbtManager, NBTOutputStream outputStream, NBTTagCompound nbt) throws IOException {
            for(String key : nbt.keySet()) {
                NBTTagType<?> nbtTagType = nbt.getTypeOf(key);
                NBTBase nbtBase;
                /*Infortunately, it's impossible to access directly to the Compound's map directly without reflection for each versions.
                Instead of this, the nbtBase is defined with his type.
                 */
                switch(nbtTagType.getId()) {
                    case 0:
                        continue; //Should not be called. If this case occurs, it will be ignored.
                    case 1:
                        nbtBase = nbtManager.of(NBTTagType.BYTE, nbt.getByte(key));
                        break;
                    case 2:
                        nbtBase = nbtManager.of(NBTTagType.SHORT, nbt.getShort(key));
                        break;
                    case 3:
                        nbtBase = nbtManager.of(NBTTagType.INT, nbt.getInt(key));
                        break;
                    case 4:
                        nbtBase = nbtManager.of(NBTTagType.LONG, nbt.getLong(key));
                        break;
                    case 5:
                        nbtBase = nbtManager.of(NBTTagType.FLOAT, nbt.getFloat(key));
                        break;
                    case 6:
                        nbtBase = nbtManager.of(NBTTagType.DOUBLE, nbt.getDouble(key));
                        break;
                    case 7:
                        nbtBase = nbtManager.of(NBTTagType.BYTE_ARRAY, nbt.getByteArray(key));
                        break;
                    case 8:
                        nbtBase = nbtManager.of(NBTTagType.STRING, nbt.getString(key));
                        break;
                    case 9:
                        nbtBase = nbtManager.of(NBTTagType.LIST);
                        for(NBTTagType<?> listType : NBTTagType.values()) {
                            nbtBase = nbt.getList(key, listType);
                            if(!nbtBase.isEmpty()) break;
                        }
                        break;
                    case 10:
                        nbtBase = nbt.getCompound(key);
                        break;
                    case 11:
                        nbtBase = nbtManager.of(NBTTagType.INT_ARRAY, nbt.getIntArray(key));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + nbtTagType.getId());
                }
                outputStream.writeNamedTag(new NamedNBT<>(key, nbtBase));
            }
            outputStream.writeTag(nbtManager.of(NBTTagType.END)); //Finish the compound
        }
    }

}