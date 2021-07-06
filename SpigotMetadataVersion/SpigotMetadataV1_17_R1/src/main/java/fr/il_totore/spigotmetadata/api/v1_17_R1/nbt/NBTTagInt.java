package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagInt extends NBTNumber<net.minecraft.nbt.NBTTagInt, Integer> {

    public NBTTagInt(net.minecraft.nbt.NBTTagInt handle) {
        super(handle);
    }

    @Override
    public Integer get() {
        return intValue();
    }
}
