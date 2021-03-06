package fr.il_totore.spigotmetadata.api.v1_11_R1.nbt;

import com.google.common.primitives.Ints;

import java.util.List;

public class NBTTagIntArray extends NBTSingleValue<net.minecraft.server.v1_11_R1.NBTTagIntArray, List<Integer>> {

    public NBTTagIntArray(net.minecraft.server.v1_11_R1.NBTTagIntArray handle) {
        super(handle);
    }

    @Override
    public List<Integer> get() {
        return Ints.asList(getHandle().d());
    }
}
