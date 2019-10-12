package fr.il_totore.entitymetadata.api.v1_13_R2.nbt;

import fr.il_totore.entitymetadata.api.nbt.NBTNumber;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;

public class NBTTagList extends NBTBase<net.minecraft.server.v1_13_R2.NBTTagList> implements fr.il_totore.entitymetadata.api.nbt.NBTTagList {

    public NBTTagList(net.minecraft.server.v1_13_R2.NBTTagList handle) {
        super(handle);
    }

    @Override
    public void add(fr.il_totore.entitymetadata.api.nbt.NBTBase nbtBase) {
        assert nbtBase instanceof NBTBase : "Invalid version";
        getHandle().add(((NBTBase) nbtBase).getHandle());
    }

    @Override
    public void set(int i, fr.il_totore.entitymetadata.api.nbt.NBTBase nbtBase) {
        assert nbtBase instanceof NBTBase : "Invalid version";
        getHandle().a(i, ((NBTBase) nbtBase).getHandle());
    }

    @Override
    public void remove(int i) {
        getHandle().remove(i);
    }

    @Override
    @SuppressWarnings("unchecked")
    public NBTBase get(int i) {
        return new NBTBase(getHandle().get(i));
    }

    @Override
    public NBTTagCompound getCompound(int i) {
        return new fr.il_totore.entitymetadata.api.v1_13_R2.nbt.NBTTagCompound(getHandle().getCompound(i));
    }

    @Override
    public NBTNumber getNumber(int i) {
        return null;
    }

    @Override
    public String getString(int i) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return getHandle().isEmpty();
    }
}
