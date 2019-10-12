package fr.il_totore.entitymetadata.api.v1_12_R1.nbt;

public class NBTTagShort extends NBTNumber<net.minecraft.server.v1_12_R1.NBTTagShort, Short> {

    public NBTTagShort(net.minecraft.server.v1_12_R1.NBTTagShort handle) {
        super(handle);
    }

    @Override
    public Short get() {
        return shortValue();
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
}
