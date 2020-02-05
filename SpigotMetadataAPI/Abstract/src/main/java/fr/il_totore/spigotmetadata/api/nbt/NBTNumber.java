package fr.il_totore.spigotmetadata.api.nbt;

public interface NBTNumber<V extends Number> extends NBTSingleValue<V> {

    /**
     * @return NBT's value as byte
     */
    byte byteValue();

    /**
     * @return NBT's value as short
     */
    short shortValue();

    /**
     * @return NBT's value as int
     */
    int intValue();

    /**
     * @return NBT's value as long
     */
    long longValue();

    /**
     * @return NBT's value as float
     */
    float floatValue();

    /**
     * @return NBT's value as double
     */
    double doubleValue();
}
