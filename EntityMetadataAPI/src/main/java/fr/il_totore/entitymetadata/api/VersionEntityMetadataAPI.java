package fr.il_totore.entitymetadata.api;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherRegistry;

public interface VersionEntityMetadataAPI {

    DataWatcherRegistry getDataWatcherRegistry();

    MetadataUtil getMetadataUtil();
}
