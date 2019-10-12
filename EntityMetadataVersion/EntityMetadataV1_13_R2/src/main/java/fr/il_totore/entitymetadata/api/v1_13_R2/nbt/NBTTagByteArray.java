package fr.il_totore.entitymetadata.api.v1_13_R2.nbt;

import com.google.common.primitives.Bytes;

import java.util.List;

public class NBTTagByteArray extends NBTSingleValue<net.minecraft.server.v1_13_R2.NBTTagByteArray, List<Byte>> {

    public NBTTagByteArray(net.minecraft.server.v1_13_R2.NBTTagByteArray handle) {
        super(handle);
    }

    @Override
    public List<Byte> get() {
        return Bytes.asList(getHandle().c());
    }

    @Override
    public boolean isEmpty() {
        if(getHandle().c() == null) return false;
        return get().isEmpty();
    }
}
