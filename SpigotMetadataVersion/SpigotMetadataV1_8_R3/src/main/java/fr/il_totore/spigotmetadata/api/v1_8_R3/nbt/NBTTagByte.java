package fr.il_totore.spigotmetadata.api.v1_8_R3.nbt;

public class NBTTagByte extends NBTNumber<net.minecraft.server.v1_8_R3.NBTTagByte, Byte> {

    public NBTTagByte(net.minecraft.server.v1_8_R3.NBTTagByte handle){
        super(handle);
    }

    @Override
    public Byte get(){
        return byteValue();
    }
}
