package fr.il_totore.entitymetadata.api.v1_13_R1.nbt;

public class NBTTagShort extends NBTNumber<net.minecraft.server.v1_13_R1.NBTTagShort, Short> {

    public NBTTagShort(net.minecraft.server.v1_13_R1.NBTTagShort handle) {
        super(handle);
    }

    @Override
    public Short get() {
        return shortValue();
    }
}
