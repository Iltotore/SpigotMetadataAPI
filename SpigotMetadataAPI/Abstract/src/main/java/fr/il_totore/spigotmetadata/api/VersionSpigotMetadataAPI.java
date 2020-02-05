package fr.il_totore.spigotmetadata.api;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherManager;
import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherRegistry;
import fr.il_totore.spigotmetadata.api.nbt.NBTManager;

public interface VersionSpigotMetadataAPI {

    /**
     * Get the {@link DataWatcherRegistry}
     *
     * @return the {@link DataWatcherRegistry} instance of this {@link VersionSpigotMetadataAPI}
     */
    DataWatcherRegistry getDataWatcherRegistry();

    /**
     * Get the {@link MetadataUtil}
     *
     * @return the {@link MetadataUtil} instance of this @{@link VersionSpigotMetadataAPI}
     * @deprecated use the {@link DataWatcherManager} and {@link NBTManager} instead
     */
    @Deprecated
    MetadataUtil getMetadataUtil();

    /**
     * Get the {@link NBTManager}
     *
     * @return the {@link NBTManager} instance of this {@link VersionSpigotMetadataAPI}
     */
    NBTManager getNBTManager();

    /**
     * Get the {@link NBTManager}
     *
     * @return the {@link NBTManager} instance of this {@link VersionSpigotMetadataAPI}
     */
    DataWatcherManager getDataWatcherManager();

}
