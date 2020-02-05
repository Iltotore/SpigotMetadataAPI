package fr.il_totore.spigotmetadata.api.nbt;

import fr.il_totore.spigotmetadata.util.ThrowingBiConsumer;
import fr.il_totore.spigotmetadata.util.ThrowingFunction;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public interface NBTManager {

    /**
     * Get a new {@link NBTTagCompound} of the given {@link Entity}
     * @param entity the {@link NBTTagCompound}'s owner
     * @return a new {@link NBTTagCompound} instance with {@link Entity}'s data
     */
    NBTTagCompound getNBTTag(Entity entity);

    /**
     * Set to the given {@link Entity} the given {@link NBTTagCompound}
     *
     * @param entity         the owner of data to edit
     * @param nbtTagCompound the {@link NBTTagCompound} used to set entity's data
     */
    void setNBTTag(Entity entity, NBTTagCompound nbtTagCompound);

    /**
     * Get a new {@link NBTTagCompound} of the given {@link ItemStack}
     *
     * @param itemStack the {@link NBTTagCompound}'s owner
     * @return a new {@link NBTTagCompound} instance with {@link ItemStack}'s data
     */
    NBTTagCompound getNBTTag(ItemStack itemStack);

    /**
     * Set to the given {@link ItemStack} the given {@link NBTTagCompound}
     *
     * @param itemStack      the owner of data to edit
     * @param nbtTagCompound the {@link NBTTagCompound} used to set entity's data
     */
    void setNBTTag(ItemStack itemStack, NBTTagCompound nbtTagCompound);

    /**
     * Get a new {@link NBTTagCompound} of the given {@link Block}
     *
     * @param block the {@link NBTTagCompound}'s owner
     * @return a new {@link NBTTagCompound} instance with {@link Block}'s data
     */
    NBTTagCompound getNBTTag(Block block);

    /**
     * Set to the given {@link Block} the given {@link NBTTagCompound}
     *
     * @param block          the owner of data to edit
     * @param nbtTagCompound the {@link NBTTagCompound} used to set entity's data
     */
    void setNBTTag(Block block, NBTTagCompound nbtTagCompound);

    /**
     * Get a new {@link NBTTagCompound} of the given {@link Location}
     *
     * @param location the {@link NBTTagCompound}'s owner
     * @return a new {@link NBTTagCompound} instance with {@link Location}'s data
     */
    NBTTagCompound getNBTTag(Location location);

    /**
     * Set to the given {@link Location} the given {@link NBTTagCompound}
     *
     * @param location       the owner of data to edit
     * @param nbtTagCompound the {@link NBTTagCompound} used to set entity's data
     */
    void setNBTTag(Location location, NBTTagCompound nbtTagCompound);

    /**
     * Create a new child instance of {@link NBTBase}
     *
     * @param type  the {@link NBTTagType} of this {@link NBTBase}
     * @param value the value to set in the new {@link NBTBase} instance
     * @param <V>   the value's generic type
     * @param <T>   the new instance's generic type
     * @return a new T instance with the given V value
     */
    <V, T extends NBTBase> T of(NBTTagType<T> type, V value);

    /**
     * Create a new child instance of {@link NBTBase}
     * @param type the {@link NBTTagType} of this {@link NBTBase}
     * @param <T> the new instance's generic type
     * @return a new T empty instance
     */
    <T extends NBTBase> T of(NBTTagType<T> type);

    /**
     * Create a new {@link NBTTagCompound} from the given String
     * @param string the {@link NBTTagCompound} string representation (can be obtained by using {@link NBTTagCompound#toString()}
     * @return a new {@link NBTTagCompound} instance with given values
     */
    NBTTagCompound fromString(String string);

    @SuppressWarnings("unchecked")
    default <T extends NBTBase> NBTSerializer<T> getSerializer(NBTTagType<T> type){
        switch(type.getId()){
            case 0:
                return (NBTSerializer<T>) new NBTSerializer.EndSerializer();

            case 1:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.BYTE, (ThrowingFunction<NBTInputStream, Byte>) DataInputStream::readByte, (ThrowingBiConsumer<NBTOutputStream, Byte>) DataOutputStream::writeByte);

            case 2:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.SHORT, (ThrowingFunction<NBTInputStream, Short>) DataInputStream::readShort, (ThrowingBiConsumer<NBTOutputStream, Short>) DataOutputStream::writeShort);

            case 3:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.INT, (ThrowingFunction<NBTInputStream, Integer>) DataInputStream::readInt, (ThrowingBiConsumer<NBTOutputStream, Integer>) DataOutputStream::writeInt);

            case 4:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.LONG, (ThrowingFunction<NBTInputStream, Long>) DataInputStream::readLong, (ThrowingBiConsumer<NBTOutputStream, Long>) DataOutputStream::writeLong);

            case 5:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.FLOAT, (ThrowingFunction<NBTInputStream, Float>) DataInputStream::readFloat, (ThrowingBiConsumer<NBTOutputStream, Float>) DataOutputStream::writeFloat);

            case 6:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.DOUBLE, (ThrowingFunction<NBTInputStream, Double>) DataInputStream::readDouble, (ThrowingBiConsumer<NBTOutputStream, Double>) DataOutputStream::writeDouble);

            case 7:
                return (NBTSerializer<T>) new NBTSerializer.ByteArraySerializer();

            case 8:
                return (NBTSerializer<T>) new NBTSerializer.SimpleValueSerializer<>(NBTTagType.STRING, (ThrowingFunction<NBTInputStream, String>) DataInput::readUTF, (ThrowingBiConsumer<NBTOutputStream, String>) DataOutputStream::writeUTF);

            case 9:
                return (NBTSerializer<T>) new NBTSerializer.ListSerializer();

            case 10:
                return (NBTSerializer<T>) new NBTSerializer.CompoundSerializer();

            case 11:
                return (NBTSerializer<T>) new NBTSerializer.IntArraySerializer();

            default:
                throw new IllegalArgumentException("Unable to find NBTSerializer for NBTTagType with id " + type.getId());
        }
    }
}
