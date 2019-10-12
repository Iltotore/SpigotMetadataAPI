package fr.il_totore.entitymetadata.api;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcher;
import fr.il_totore.entitymetadata.api.nbt.NBTBase;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;
import fr.il_totore.entitymetadata.api.nbt.NBTTagType;
import org.bukkit.entity.Entity;

public interface MetadataUtil {

    DataWatcher getDataWatcher(Entity entity);

    NBTTagCompound getNBTTag(Entity entity);

    void setNBTTag(Entity entity, NBTTagCompound nbtTagCompound);

    <V, T extends NBTBase> T nbtOf(NBTTagType<T> type, V value);
}
