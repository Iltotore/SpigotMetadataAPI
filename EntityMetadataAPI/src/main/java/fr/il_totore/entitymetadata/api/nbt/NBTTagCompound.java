package fr.il_totore.entitymetadata.api.nbt;

import java.util.Set;

public interface NBTTagCompound extends NBTBase {

    /**
     * Put the given byte value with the key.
     * @param key   the given key as {@link String}
     * @param value the value to put with the key
     */
    void setByte(String key, byte value);

    /**
     * Put the given short value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setShort(String key, short value);

    /**
     * Put the given int value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setInt(String key, int value);

    /**
     * Put the given long value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setLong(String key, long value);

    /**
     * Put the given float value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setFloat(String key, float value);

    /**
     * Put the given double value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setDouble(String key, double value);

    /**
     * Put the given {@link String} value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setString(String key, String value);

    /**
     * Put the given byte array with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setByteArray(String key, byte[] value);

    /**
     * Put the given int array with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setIntArray(String key, int[] value);

    /**
     * Put the given boolean value with the key.
     * @param key the given key as {@link String}
     * @param value the value to put with the key
     */
    void setBoolean(String key, boolean value);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    byte getByte(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    short getShort(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    int getInt(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    long getLong(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    float getFloat(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    double getDouble(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    String getString(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    byte[] getByteArray(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    int[] getIntArray(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    NBTTagCompound getCompound(String key);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    NBTTagList getList(String key, NBTTagType type);

    /**
     * Get the value associated to the given key
     * @param key the given key as {@link String}
     * @return the value associated to the given key
     */
    boolean getBoolean(String key);

    /**
     * Remove the value associated to the given key
     * @param key the key of the entry to remove
     */
    void remove(String key);

    /**
     * return the {@link NBTTagType} of the value associated to the given key
     * @param key the key of the value
     * @return
     */
    NBTTagType getTypeOf(String key);

    /**
     * check if the given key exists
     * @param key the given key
     * @return true if an entry with the given key exists
     */
    boolean hasKey(String key);

    /**
     * Check if the {@link NBTTagCompound} has a value of the given {@link NBTTagType} associated with the given key
     * @param key the given key
     * @param type the type co compare
     * @return true if a value associated with the given key is of the given type
     */
    boolean hasKeyOfType(String key, NBTTagType type);

    /**
     * Check if the {@link NBTTagCompound} is empty
     * @return true if empty
     */
    boolean isEmpty();

    /**
     * @return a set of the {@link NBTTagCompound} keys
     */
    Set<String> toSet();

    /**
     * {@inheritDoc}
     * @return {@link NBTTagType#COMPOUND}
     */
    NBTTagType getType();
}
