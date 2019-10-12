package fr.il_totore.entitymetadata.api.v1_13_R1.nbt;

public abstract class NBTNumber<T extends net.minecraft.server.v1_13_R1.NBTNumber, V extends Number> extends NBTSingleValue<T, V> implements fr.il_totore.entitymetadata.api.nbt.NBTNumber<V> {

    public NBTNumber(T handle) {
        super(handle);
    }

    @Override
    public byte byteValue() {
        return getHandle().g();
    }

    @Override
    public short shortValue() {
        return getHandle().f();
    }

    @Override
    public int intValue() {
        return getHandle().e();
    }

    @Override
    public long longValue() {
        return getHandle().d();
    }

    @Override
    public float floatValue() {
        return getHandle().i();
    }

    @Override
    public double doubleValue() {
        return getHandle().asDouble();
    }

    @Override
    public boolean isEmpty() {
        return getHandle().j() == null;
    }
}
