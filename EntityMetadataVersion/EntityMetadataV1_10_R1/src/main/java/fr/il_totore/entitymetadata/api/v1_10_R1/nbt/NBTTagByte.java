package fr.il_totore.entitymetadata.api.v1_10_R1.nbt;

public class NBTTagByte extends NBTNumber<net.minecraft.server.v1_10_R1.NBTTagByte, Byte> {

    public NBTTagByte(net.minecraft.server.v1_10_R1.NBTTagByte handle) {
        super(handle);
    }

    @Override
    public Byte get() {
        return byteValue();
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
        return getHandle().h();
    }
}
