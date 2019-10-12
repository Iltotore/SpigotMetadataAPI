package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

public class NBTTagByte extends NBTNumber<net.minecraft.server.v1_9_R2.NBTTagByte, Byte> {

    public NBTTagByte(net.minecraft.server.v1_9_R2.NBTTagByte handle) {
        super(handle);
    }

    @Override
    public Byte get() {
        return byteValue();
    }
}
