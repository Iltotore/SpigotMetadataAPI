package fr.il_totore.spigotmetadata.api.nbt;

public interface NBTSingleValue<T> extends NBTBase {

    /**
     * Get the NBT's value
     * @return the NBT's value as T
     */
    T get();
}
