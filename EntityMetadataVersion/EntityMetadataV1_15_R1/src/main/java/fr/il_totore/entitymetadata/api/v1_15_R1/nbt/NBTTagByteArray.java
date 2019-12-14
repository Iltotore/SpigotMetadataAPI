package fr.il_totore.entitymetadata.api.v1_15_R1.nbt;

import com.google.common.primitives.Bytes;

import java.util.List;

public class NBTTagByteArray extends NBTSingleValue<net.minecraft.server.v1_15_R1.NBTTagByteArray, List<Byte>> {

    public NBTTagByteArray(net.minecraft.server.v1_15_R1.NBTTagByteArray handle) {
        super(handle);
    }

    @Override
    public List<Byte> get() {
        return Bytes.asList(getHandle().getBytes());
    }

    @Override
    public boolean isEmpty() {
        return getHandle().isEmpty();
    }
}
