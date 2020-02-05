package fr.il_totore.spigotmetadata.api.v1_12_R1.nbt;

import net.minecraft.server.v1_12_R1.NBTBase;

public abstract class NBTNumber<T extends NBTBase, V extends Number> extends NBTSingleValue<T, V> implements fr.il_totore.spigotmetadata.api.nbt.NBTNumber<V> {


    public NBTNumber(T handle) {
        super(handle);
    }

}
