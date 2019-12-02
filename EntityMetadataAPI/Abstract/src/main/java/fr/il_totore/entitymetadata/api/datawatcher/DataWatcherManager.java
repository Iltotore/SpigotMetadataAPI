package fr.il_totore.entitymetadata.api.datawatcher;

import org.bukkit.entity.Entity;

public interface DataWatcherManager {

    /**
     * Get the {@link DataWatcher} of the passed {@link Entity}
     * @param entity the {@link DataWatcher}'s owner
     * @return the {@link DataWatcher} of the given {@link Entity}
     */
    DataWatcher getDataWatcher(Entity entity);
}
