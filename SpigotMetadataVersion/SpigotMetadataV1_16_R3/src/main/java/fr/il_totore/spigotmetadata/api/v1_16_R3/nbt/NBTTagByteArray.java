package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

import com.google.common.primitives.Bytes;

import java.util.List;

public class NBTTagByteArray extends NBTSingleValue<net.minecraft.server.v1_16_R3.NBTTagByteArray, List<Byte>> {

    public NBTTagByteArray(net.minecraft.server.v1_16_R3.NBTTagByteArray handle) {
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
