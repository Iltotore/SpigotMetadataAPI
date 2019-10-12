package fr.il_totore.entitymetadata.api.v1_8_R3.nbt;

public class NBTTagDouble extends NBTNumber<net.minecraft.server.v1_8_R3.NBTTagDouble, Double> {

    public NBTTagDouble(net.minecraft.server.v1_8_R3.NBTTagDouble handle){
        super(handle);
    }

    @Override
    public Double get(){
        return doubleValue();
    }
}
