package fr.il_totore.spigotmetadata.api.v1_16_R3.datawatcher;


import org.bukkit.craftbukkit.v1_16_R3.entity.CraftEntity;
import org.bukkit.entity.Entity;

public class DataWatcherManager implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherManager {
    @Override
    public DataWatcher getDataWatcher(Entity entity) {
        return new DataWatcher(((CraftEntity) entity).getHandle().getDataWatcher());
    }
}
