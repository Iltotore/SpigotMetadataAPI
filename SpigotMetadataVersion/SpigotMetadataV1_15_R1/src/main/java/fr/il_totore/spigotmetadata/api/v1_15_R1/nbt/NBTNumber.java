package fr.il_totore.spigotmetadata.api.v1_15_R1.nbt;

public abstract class NBTNumber<T extends net.minecraft.server.v1_15_R1.NBTNumber, V extends Number> extends NBTSingleValue<T, V> implements fr.il_totore.spigotmetadata.api.nbt.NBTNumber<V> {

    public NBTNumber(T handle) {
        super(handle);
    }

    @Override
    public byte byteValue() {
        return getHandle().asByte();
    }

    @Override
    public short shortValue() {
        return getHandle().asShort();
    }

    @Override
    public int intValue() {
        return getHandle().asInt();
    }

    @Override
    public long longValue() {
        return getHandle().asLong();
    }

    @Override
    public float floatValue() {
        return getHandle().asFloat();
    }

    @Override
    public double doubleValue() {
        return getHandle().asDouble();
    }

    @Override
    public boolean isEmpty() {
        return getHandle().k() == null;
    }
}
