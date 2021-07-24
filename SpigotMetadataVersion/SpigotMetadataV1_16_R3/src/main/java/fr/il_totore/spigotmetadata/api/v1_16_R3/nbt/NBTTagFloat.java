package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

public class NBTTagFloat extends NBTNumber<net.minecraft.server.v1_16_R3.NBTTagFloat, Float> {

    public NBTTagFloat(net.minecraft.server.v1_16_R3.NBTTagFloat handle) {
        super(handle);
    }

    @Override
    public Float get() {
        return floatValue();
    }
}
