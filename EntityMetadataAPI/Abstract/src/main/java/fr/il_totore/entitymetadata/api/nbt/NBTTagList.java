package fr.il_totore.entitymetadata.api.nbt;

public interface NBTTagList extends NBTBase {

    /**
     * Add a {@link NBTBase}
     * @param nbtBase the element to be added
     */
    void add(NBTBase nbtBase);

    /**
     * Set a {@link NBTBase} at the given index
     * @param i the index to set the element
     * @param nbtBase the element to set
     */
    void set(int i, NBTBase nbtBase);

    /**
     * Remove an element at the given index
     * @param i the element to remove's index
     */
    void remove(int i);

    /**
     * Get the {@link NBTBase} at the given index
     * @param i location of the {@link NBTBase}
     * @return the {@link NBTBase} at the given index
     */
    NBTBase get(int i);

    /**
     * Get the {@link NBTTagCompound} at the given index
     * @param i location of the {@link NBTTagCompound}
     * @return the {@link NBTTagCompound} at the given index
     */
    NBTTagCompound getCompound(int i);

    /**
     * Get the {@link NBTNumber} at the given index
     * @param i location of the {@link NBTNumber}
     * @return the {@link NBTNumber} at the given index
     */
    NBTNumber getNumber(int i);

    /**
     * Get the {@link String} at the given index
     * @param i location of the {@link String}
     * @return the {@link String} at the given index
     */
    String getString(int i);

    /**
     * Get the {@link NBTTagList}'s size
     * @return the list's size
     */
    int size();

    /**
     * {@inheritDoc}
     * @return {@link NBTTagType#LIST}
     */
    NBTTagType getType();
}