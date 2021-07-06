package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.nbt.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.nbt.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
    }
}
