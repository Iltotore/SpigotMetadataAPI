package fr.il_totore.entitymetadata.api.v1_13_R1.nbt;

public class NBTTagDouble extends NBTNumber<net.minecraft.server.v1_13_R1.NBTTagDouble, Double> {

    public NBTTagDouble(net.minecraft.server.v1_13_R1.NBTTagDouble handle) {
        super(handle);
    }

    @Override
    public Double get() {
        return doubleValue();
    }
}
