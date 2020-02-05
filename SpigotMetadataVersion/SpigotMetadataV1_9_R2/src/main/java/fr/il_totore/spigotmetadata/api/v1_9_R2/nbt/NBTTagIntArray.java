package fr.il_totore.spigotmetadata.api.v1_9_R2.nbt;

import com.google.common.primitives.Ints;

import java.util.List;

public class NBTTagIntArray extends NBTSingleValue<net.minecraft.server.v1_9_R2.NBTTagIntArray, List<Integer>> {

    public NBTTagIntArray(net.minecraft.server.v1_9_R2.NBTTagIntArray handle) {
        super(handle);
    }

    @Override
    public List<Integer> get() {
        return Ints.asList(getHandle().c());
    }
}