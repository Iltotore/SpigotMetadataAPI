package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

public class NBTTagFloat extends NBTNumber<net.minecraft.server.v1_9_R2.NBTTagFloat, Float> {

    public NBTTagFloat(net.minecraft.server.v1_9_R2.NBTTagFloat handle) {
        super(handle);
    }

    @Override
    public Float get() {
        return floatValue();
    }
}
