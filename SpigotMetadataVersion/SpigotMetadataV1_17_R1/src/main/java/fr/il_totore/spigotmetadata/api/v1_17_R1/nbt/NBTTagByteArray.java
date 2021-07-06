package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

import com.google.common.primitives.Bytes;

import java.util.List;

public class NBTTagByteArray extends NBTSingleValue<net.minecraft.nbt.NBTTagByteArray, List<Byte>> {

    public NBTTagByteArray(net.minecraft.nbt.NBTTagByteArray handle) {
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
