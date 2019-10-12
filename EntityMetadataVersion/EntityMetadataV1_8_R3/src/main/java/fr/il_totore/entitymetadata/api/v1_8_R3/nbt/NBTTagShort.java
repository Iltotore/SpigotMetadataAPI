package fr.il_totore.entitymetadata.api.v1_8_R3.nbt;

public class NBTTagShort extends NBTNumber<net.minecraft.server.v1_8_R3.NBTTagShort, Short> {

    public NBTTagShort(net.minecraft.server.v1_8_R3.NBTTagShort handle){
        super(handle);
    }

    @Override
    public Short get(){
        return shortValue();
    }
}
