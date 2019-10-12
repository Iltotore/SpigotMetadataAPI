package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

public class NBTTagInt extends NBTNumber<net.minecraft.server.v1_9_R2.NBTTagInt, Integer> {

    public NBTTagInt(net.minecraft.server.v1_9_R2.NBTTagInt handle) {
        super(handle);
    }

    @Override
    public Integer get() {
        return intValue();
    }
}
