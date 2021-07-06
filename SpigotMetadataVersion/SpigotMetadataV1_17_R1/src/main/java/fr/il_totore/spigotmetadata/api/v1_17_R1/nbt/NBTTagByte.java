package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public class NBTTagByte extends NBTNumber<net.minecraft.nbt.NBTTagByte, Byte> {

    public NBTTagByte(net.minecraft.nbt.NBTTagByte handle) {
        super(handle);
    }

    @Override
    public Byte get() {
        return byteValue();
    }
}
