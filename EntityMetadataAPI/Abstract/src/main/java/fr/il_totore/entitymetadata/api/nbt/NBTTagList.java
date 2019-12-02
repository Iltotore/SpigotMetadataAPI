package fr.il_totore.entitymetadata.api.nbt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface NBTTagList extends NBTBase {

    /**
     * Add a {@link NBTBase}
     *
     * @param nbtBase the element to be added
     */
    void add(NBTBase nbtBase);

    /**
     * Add all {@link NBTBase}
     *
     * @param nbtBases the {@link Collection} of {@link NBTBase} to be added
     */
    void addAll(Collection<NBTBase> nbtBases);

    /**
     * Set a {@link NBTBase} at the given index
     *
     * @param i       the index to set the element
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
     *
     * @param nbtManager the {@link NBTManager} instance
     * @param i          location of the {@link NBTBase}
     * @param <T>        the {@link NBTBase} type
     * @return the {@link NBTBase} at the given index
     */
    @SuppressWarnings("unchecked")
    default <T extends NBTBase> T get(NBTManager nbtManager, int i) {
        switch(getValueType().getId()) {
            case 0:
                return (T) nbtManager.of(NBTTagType.END); //Should not be called. If this case occurs, it will be ignored.
            case 5:
                return (T) getFloat(i);
            case 6:
                return (T) getDouble(i);
            case 8:
                return (T) nbtManager.of(NBTTagType.STRING, getString(i));
            case 10:
                return (T) getCompound(i);
            default:
                throw new IllegalStateException("Unexpected value: " + getValueType().getId());
        }
    }

    /**
     * Get the {@link NBTTagCompound} at the given index
     * @param i location of the {@link NBTTagCompound}
     * @return the {@link NBTTagCompound} at the given index
     */
    NBTTagCompound getCompound(int i);

    /**
     * Get the {@link Float} value at the given index
     *
     * @param i location of the {@link NBTNumber}
     * @return the {@link NBTNumber} containing the float value at the given index
     */
    NBTNumber<Float> getFloat(int i);

    /**
     * Get the {@link Double} value at the given index
     *
     * @param i location of the {@link NBTNumber}
     * @return the {@link NBTNumber} containing the double value at the given index
     */
    NBTNumber<Double> getDouble(int i);

    /**
     * Get the int values at the given index
     *
     * @param i location of the array
     * @return the {@link NBTSingleValue} containing the int values at the given index
     */
    NBTSingleValue<List<Integer>> getIntArray(int i);

    /**
     * Get the {@link NBTSingleValue} at the given index
     *
     * @param i location of the {@link NBTSingleValue}
     * @return the {@link NBTSingleValue} at the given index
     */
    NBTSingleValue<String> getString(int i);

    /**
     * Get all contained tags
     *
     * @param nbtManager the {@link NBTManager} instance
     * @return all contained {@link NBTBase} as {@link Collection}
     */
    default Collection<NBTBase> getTags(NBTManager nbtManager) {
        List<NBTBase> nbtBases = new ArrayList<>();
        for(int i = 0; i < size(); i++) nbtBases.add(get(nbtManager, i));
        return nbtBases;
    }

    /**
     * Get the {@link NBTTagList}'s size
     *
     * @return the list's size
     */
    int size();

    /**
     * {@inheritDoc}
     *
     * @return {@link NBTTagType#LIST}
     */
    NBTTagType<NBTTagList> getType();

    /**
     * Return the type of contained values
     * @return the {@link NBTTagType} of contained values
     */
    NBTTagType<?> getValueType();
}