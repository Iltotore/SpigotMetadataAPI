package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

public class NBTTagString extends NBTSingleValue<net.minecraft.server.v1_16_R3.NBTTagString, String> {

    public NBTTagString(net.minecraft.server.v1_16_R3.NBTTagString handle) {
        super(handle);
    }

    @Override
    public String get() {
        return getHandle().asString();
    }

    @Override
    public boolean isEmpty() {
        return getHandle().asString() == null;
    }
}
