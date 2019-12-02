package fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Entity;

public class DataWatcherManager implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherManager {
    @Override
    public DataWatcher getDataWatcher(Entity entity) {
        return new DataWatcher(((CraftEntity) entity).getHandle().getDataWatcher());
    }
}
