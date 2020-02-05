package fr.il_totore.spigotmetadata.api;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcher;
import fr.il_totore.spigotmetadata.api.nbt.NBTBase;
import fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound;
import fr.il_totore.spigotmetadata.api.nbt.NBTTagType;
import org.bukkit.entity.Entity;

@Deprecated
public interface MetadataUtil {

    /**
     * Get the {@link DataWatcher} of the passed {@link Entity}
     *
     * @param entity the {@link DataWatcher}'s owner
     * @return the {@link DataWatcher} of the given {@link Entity}
     */
    DataWatcher getDataWatcher(Entity entity);

    /**
     * Get a new {@link NBTTagCompound} of the given {@link Entity}
     * @param entity the {@link NBTTagCompound}'s owner
     * @return a new {@link NBTTagCompound} instance with {@link Entity}'s data
     */
    NBTTagCompound getNBTTag(Entity entity);

    /**
     * Set to the given {@link Entity} the given {@link NBTTagCompound}
     * @param entity the owner of data to edit
     * @param nbtTagCompound the {@link NBTTagCompound} used to set entity's data
     */
    void setNBTTag(Entity entity, NBTTagCompound nbtTagCompound);

    /**
     * Create a new child instance of {@link NBTBase}
     * @param type the {@link NBTTagType} of this {@link NBTBase}
     * @param value the value to set in the new {@link NBTBase} instance
     * @param <V> the value's generic type
     * @param <T> the new instance's generic type
     * @return a new T instance with the given V value
     */
    <V, T extends NBTBase> T nbtOf(NBTTagType<T> type, V value);
}
