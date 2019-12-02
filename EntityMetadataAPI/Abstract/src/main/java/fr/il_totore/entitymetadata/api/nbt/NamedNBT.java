package fr.il_totore.entitymetadata.api.nbt;


import com.google.common.base.Preconditions;

public class NamedNBT<T extends NBTBase> implements NBTBase {

    private String name;
    private T nbtBase;

    public NamedNBT(String name, T nbtBase) {
        Preconditions.checkNotNull(name, "name");
        Preconditions.checkNotNull(nbtBase, "nbtBase");
        this.name = name;
        this.nbtBase = nbtBase;
    }

    @Override
    public boolean isEmpty() {
        return nbtBase.isEmpty();
    }

    @Override
    public NBTTagType getType() {
        return nbtBase.getType();
    }

    public String getName() {
        return this.name;
    }

    public T getValue() {
        return nbtBase;
    }

    @Override
    public String toString() {
        return "{name:\"" + name + "\",value:" + nbtBase.toString() + "}";
    }
}
