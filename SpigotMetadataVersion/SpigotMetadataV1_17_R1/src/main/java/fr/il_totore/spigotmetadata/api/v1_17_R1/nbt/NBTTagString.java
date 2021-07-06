package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagString extends NBTSingleValue<net.minecraft.nbt.NBTTagString, String> {

    public NBTTagString(net.minecraft.nbt.NBTTagString handle) {
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
