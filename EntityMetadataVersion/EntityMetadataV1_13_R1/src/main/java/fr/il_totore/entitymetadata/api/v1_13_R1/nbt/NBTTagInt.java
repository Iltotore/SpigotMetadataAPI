package fr.il_totore.entitymetadata.api.v1_13_R1.nbt;

public class NBTTagInt extends NBTNumber<net.minecraft.server.v1_13_R1.NBTTagInt, Integer> {

    public NBTTagInt(net.minecraft.server.v1_13_R1.NBTTagInt handle) {
        super(handle);
    }

    @Override
    public Integer get() {
        return intValue();
    }
}
