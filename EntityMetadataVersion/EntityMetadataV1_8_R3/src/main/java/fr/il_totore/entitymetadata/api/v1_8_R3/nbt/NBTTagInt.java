package fr.il_totore.entitymetadata.api.v1_8_R3.nbt;

public class NBTTagInt extends NBTNumber<net.minecraft.server.v1_8_R3.NBTTagInt, Integer> {

    public NBTTagInt(net.minecraft.server.v1_8_R3.NBTTagInt handle){
        super(handle);
    }

    @Override
    public Integer get(){
        return intValue();
    }
}
