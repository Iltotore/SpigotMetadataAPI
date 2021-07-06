package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagDouble extends NBTNumber<net.minecraft.nbt.NBTTagDouble, Double> {

    public NBTTagDouble(net.minecraft.nbt.NBTTagDouble handle) {
        super(handle);
    }

    @Override
    public Double get() {
        return doubleValue();
    }
}
