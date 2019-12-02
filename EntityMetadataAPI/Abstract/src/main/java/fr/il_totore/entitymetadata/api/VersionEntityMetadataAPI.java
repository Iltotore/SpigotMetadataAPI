package fr.il_totore.entitymetadata.api;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherManager;
import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherRegistry;
import fr.il_totore.entitymetadata.api.nbt.NBTManager;

public interface VersionEntityMetadataAPI {

    /**
     * Get the {@link DataWatcherRegistry}
     *
     * @return the {@link DataWatcherRegistry} instance of this {@link VersionEntityMetadataAPI}
     */
    DataWatcherRegistry getDataWatcherRegistry();

    /**
     * Get the {@link MetadataUtil}
     *
     * @return the {@link MetadataUtil} instance of this @{@link VersionEntityMetadataAPI}
     * @deprecated use the {@link DataWatcherManager} and {@link NBTManager} instead
     */
    @Deprecated
    MetadataUtil getMetadataUtil();

    /**
     * Get the {@link NBTManager}
     *
     * @return the {@link NBTManager} instance of this {@link VersionEntityMetadataAPI}
     */
    NBTManager getNBTManager();

    /**
     * Get the {@link NBTManager}
     *
     * @return the {@link NBTManager} instance of this {@link VersionEntityMetadataAPI}
     */
    DataWatcherManager getDataWatcherManager();

}
