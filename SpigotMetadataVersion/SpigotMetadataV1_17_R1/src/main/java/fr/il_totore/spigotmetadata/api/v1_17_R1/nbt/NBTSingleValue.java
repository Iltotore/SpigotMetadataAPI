package fr.il_totore.spigotmetadata.api.v1_17_R1.nbt;

public abstract class NBTSingleValue<T extends net.minecraft.nbt.NBTBase, V> extends NBTBase<T> implements fr.il_totore.spigotmetadata.api.nbt.NBTSingleValue<V> {

    public NBTSingleValue(T handle) {
        super(handle);
    }
}
