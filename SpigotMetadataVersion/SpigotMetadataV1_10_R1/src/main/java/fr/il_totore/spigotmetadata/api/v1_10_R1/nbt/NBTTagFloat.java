package fr.il_totore.spigotmetadata.api.v1_10_R1.nbt;

public class NBTTagFloat extends NBTNumber<net.minecraft.server.v1_10_R1.NBTTagFloat, Float> {

    public NBTTagFloat(net.minecraft.server.v1_10_R1.NBTTagFloat handle) {
        super(handle);
    }

    @Override
    public Float get() {
        return floatValue();
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
