package fr.il_totore.spigotmetadata.api.v1_16_R1.nbt;

public class NBTTagInt extends NBTNumber<net.minecraft.server.v1_16_R1.NBTTagInt, Integer> {

    public NBTTagInt(net.minecraft.server.v1_16_R1.NBTTagInt handle) {
        super(handle);
    }

    @Override
    public Integer get() {
        return intValue();
    }
}
