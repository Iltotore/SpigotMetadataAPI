package fr.il_totore.entitymetadata.api.v1_9_R1.datawatcher;


import org.bukkit.craftbukkit.v1_9_R1.entity.CraftEntity;
import org.bukkit.entity.Entity;

public class DataWatcherManager implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherManager {
    @Override
    public DataWatcher getDataWatcher(Entity entity) {
        return new DataWatcher(((CraftEntity) entity).getHandle().getDataWatcher());
    }
}
