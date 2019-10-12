package fr.il_totore.entitymetadata.api.v1_13_R2.nbt;

public abstract class NBTSingleValue<T extends net.minecraft.server.v1_13_R2.NBTBase, V> extends NBTBase<T> implements fr.il_totore.entitymetadata.api.nbt.NBTSingleValue<V> {

    public NBTSingleValue(T handle) {
        super(handle);
    }
}
