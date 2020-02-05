package fr.il_totore.spigotmetadata.api.v1_9_R2.nbt;

import com.google.common.primitives.Bytes;

import java.util.List;

public class NBTTagByteArray extends NBTSingleValue<net.minecraft.server.v1_9_R2.NBTTagByteArray, List<Byte>> {

    public NBTTagByteArray(net.minecraft.server.v1_9_R2.NBTTagByteArray handle) {
        super(handle);
    }

    @Override
    public List<Byte> get() {
        return Bytes.asList(getHandle().c());
    }
}
