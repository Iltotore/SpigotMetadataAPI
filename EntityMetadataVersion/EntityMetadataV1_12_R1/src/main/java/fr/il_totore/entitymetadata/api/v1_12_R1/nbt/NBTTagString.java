package fr.il_totore.entitymetadata.api.v1_12_R1.nbt;

public class NBTTagString extends NBTSingleValue<net.minecraft.server.v1_12_R1.NBTTagString, String> {

    public NBTTagString(net.minecraft.server.v1_12_R1.NBTTagString handle) {
        super(handle);
    }

    @Override
    public String get() {
        return getHandle().c_();
    }
}
