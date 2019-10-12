package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

import fr.il_totore.entitymetadata.api.nbt.NBTTagType;

public class NBTBase<T extends net.minecraft.server.v1_9_R2.NBTBase> implements fr.il_totore.entitymetadata.api.nbt.NBTBase {

    private T handle;

    public NBTBase(T handle) {
        this.handle = handle;
    }

    public T getHandle() {
        return handle;
    }

    @Override
    public boolean isEmpty() {
        return handle.isEmpty();
    }

    @Override
    public NBTTagType getType() {
        return NBTTagType.getById(handle.getTypeId());
    }
}
