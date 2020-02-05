package fr.il_totore.spigotmetadata.api.v1_9_R1.nbt;

public class NBTTagFloat extends NBTNumber<net.minecraft.server.v1_9_R1.NBTTagFloat, Float> {

    public NBTTagFloat(net.minecraft.server.v1_9_R1.NBTTagFloat handle) {
        super(handle);
    }

    @Override
    public Float get() {
        return floatValue();
    }
}
