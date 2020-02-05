package fr.il_totore.spigotmetadata.api.v1_13_R2.nbt;

import fr.il_totore.spigotmetadata.api.nbt.NBTTagType;

public class NBTBase<T extends net.minecraft.server.v1_13_R2.NBTBase> implements fr.il_totore.spigotmetadata.api.nbt.NBTBase {

    private T handle;

    public NBTBase(T handle) {
        this.handle = handle;
    }

    public T getHandle() {
        return handle;
    }

    @Override
    public NBTTagType getType() {
        return NBTTagType.getById(handle.getTypeId());
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
