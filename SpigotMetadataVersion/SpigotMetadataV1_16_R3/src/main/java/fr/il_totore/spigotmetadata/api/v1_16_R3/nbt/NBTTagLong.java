package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_16_R3.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_16_R3.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
    }
}
