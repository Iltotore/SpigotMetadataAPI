package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

import com.google.common.primitives.Ints;

import java.util.List;

public class NBTTagIntArray extends NBTSingleValue<net.minecraft.server.v1_16_R3.NBTTagIntArray, List<Integer>> {

    public NBTTagIntArray(net.minecraft.server.v1_16_R3.NBTTagIntArray handle) {
        super(handle);
    }

    @Override
    public List<Integer> get() {
        return Ints.asList(getHandle().getInts());
    }

    @Override
    public boolean isEmpty() {
        return getHandle().isEmpty();
    }
}
