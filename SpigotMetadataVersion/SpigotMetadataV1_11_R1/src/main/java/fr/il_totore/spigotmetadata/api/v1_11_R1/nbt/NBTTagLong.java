package fr.il_totore.spigotmetadata.api.v1_11_R1.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_11_R1.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_11_R1.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
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
