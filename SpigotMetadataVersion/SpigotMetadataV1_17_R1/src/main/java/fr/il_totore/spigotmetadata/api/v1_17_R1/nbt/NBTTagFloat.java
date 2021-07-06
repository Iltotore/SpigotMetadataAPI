package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagFloat extends NBTNumber<net.minecraft.nbt.NBTTagFloat, Float> {

    public NBTTagFloat(net.minecraft.nbt.NBTTagFloat handle) {
        super(handle);
    }

    @Override
    public Float get() {
        return floatValue();
    }
}
