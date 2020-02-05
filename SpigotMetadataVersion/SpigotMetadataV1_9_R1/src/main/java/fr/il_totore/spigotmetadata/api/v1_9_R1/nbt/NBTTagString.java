package fr.il_totore.spigotmetadata.api.v1_9_R1.nbt;

public class NBTTagString extends NBTSingleValue<net.minecraft.server.v1_9_R1.NBTTagString, String> {

    public NBTTagString(net.minecraft.server.v1_9_R1.NBTTagString handle) {
        super(handle);
    }

    @Override
    public String get() {
        return getHandle().a_();
    }
}
