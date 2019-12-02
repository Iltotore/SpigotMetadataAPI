package fr.il_totore.entitymetadata.api.nbt;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NBTInputStream extends DataInputStream {

    private NBTManager nbtManager;

    /**
     * Creates a {@link NBTInputStream} that uses the specified
     * underlying InputStream.
     *
     * @param nbtManager the {@link NBTManager} instance
     * @param in         the specified input stream
     */
    public NBTInputStream(NBTManager nbtManager, InputStream in) {
        super(in);
        this.nbtManager = nbtManager;
    }

    /**
     * Read the next unnamed tag. An additive byte will be read to find the tag's type.
     *
     * @return the next NBTTag
     * @throws IOException if the discovered tag type is unknown or if a deserialization error occurs
     */
    public NBTBase readTag() throws IOException {
        byte typeId = readByte();
        NBTTagType<?> nbtTagType = NBTTagType.getById(typeId);

        if(nbtTagType == null) throw new IOException("Unknown NBTTag type: " + typeId);
        if(nbtTagType == NBTTagType.END) return null;

        return readTag(nbtTagType);
    }

    /**
     * Read the next unnamed tag.
     *
     * @param nbtTagType the {@link NBTTagType} used to read the tag. It is also used to pass the generic NBT type.
     * @param <T>        the returned {@link NBTBase} type passed thought the {@link NBTTagType}
     * @return the next NBTTag
     * @throws IOException if the discovered tag type is unknown or if a deserialization error occurs
     */
    public <T extends NBTBase> T readTag(NBTTagType<T> nbtTagType) throws IOException {
        return nbtManager.getSerializer(nbtTagType).read(nbtManager, this);
    }

    /**
     * Read the next named tag. An additive byte and a UTF {@link String} will be read to find the tag's type and name.
     *
     * @return the next NBTTag
     * @throws IOException if the discovered tag type is unknown or if a deserialization error occurs
     */
    public NamedNBT<?> readNamedTag() throws IOException {
        byte typeId = readByte();
        NBTTagType<?> nbtTagType = NBTTagType.getById(typeId);

        if(nbtTagType == null) throw new IOException("Unknown NBTTag type: " + typeId);
        if(nbtTagType == NBTTagType.END) return null;

        return readNamedTag(nbtTagType);
    }

    /**
     * Read the next unnamed tag. An additive UTF {@link String} will be read to find the tag's name
     *
     * @param nbtTagType the {@link NBTTagType} used to read the tag. It is also used to pass the generic NBT type.
     * @param <T>        the returned {@link NBTBase} type passed thought the {@link NBTTagType}
     * @return the next NBTTag
     * @throws IOException if the discovered tag type is unknown or if a deserialization error occurs
     */
    public <T extends NBTBase> NamedNBT<T> readNamedTag(NBTTagType<T> nbtTagType) throws IOException {
        return new NamedNBT<>(readUTF(), readTag(nbtTagType));
    }

}
