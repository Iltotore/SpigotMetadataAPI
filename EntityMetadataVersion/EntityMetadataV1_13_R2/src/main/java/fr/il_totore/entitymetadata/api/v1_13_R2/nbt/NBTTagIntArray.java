package fr.il_totore.entitymetadata.api.v1_13_R2.nbt;

import com.google.common.primitives.Ints;

import java.util.List;

public class NBTTagIntArray extends NBTSingleValue<net.minecraft.server.v1_13_R2.NBTTagIntArray, List<Integer>> {

    public NBTTagIntArray(net.minecraft.server.v1_13_R2.NBTTagIntArray handle) {
        super(handle);
    }

    @Override
    public List<Integer> get() {
        return Ints.asList(getHandle().d());
    }

    @Override
    public boolean isEmpty() {
        if(getHandle().d() == null) return false;
        return get().isEmpty();
    }
}
