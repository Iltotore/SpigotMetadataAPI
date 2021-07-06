package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagShort extends NBTNumber<net.minecraft.nbt.NBTTagShort, Short> {

    public NBTTagShort(net.minecraft.nbt.NBTTagShort handle) {
        super(handle);
    }

    @Override
    public Short get() {
        return shortValue();
    }
}
