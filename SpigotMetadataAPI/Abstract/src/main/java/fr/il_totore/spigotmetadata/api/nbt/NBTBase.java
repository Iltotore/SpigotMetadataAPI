package fr.il_totore.spigotmetadata.api.nbt;

public interface NBTBase extends Cloneable {

    /**
     * Check if the {@link NBTBase} is empty
     * @return true if empty
     */
    boolean isEmpty();

    /**
     * Get the NBTTag's type
     * @return the {@link NBTTagType}
     */
    NBTTagType getType();

}
