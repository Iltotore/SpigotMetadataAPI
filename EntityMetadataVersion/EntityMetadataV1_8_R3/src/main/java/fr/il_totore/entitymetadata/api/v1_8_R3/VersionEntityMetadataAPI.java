package fr.il_totore.entitymetadata.api.v1_8_R3;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher.DataWatcherManager;
import fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher.DataWatcherRegistry;
import fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher.DataWatcherSerializer;
import fr.il_totore.entitymetadata.api.v1_8_R3.nbt.NBTManager;

public class VersionEntityMetadataAPI implements fr.il_totore.entitymetadata.api.VersionEntityMetadataAPI {

    private DataWatcherRegistry dataWatcherRegistry;
    private MetadataUtil metadataUtil = new MetadataUtil();
    private NBTManager nbtManager = new NBTManager();
    private DataWatcherManager dataWatcherManager = new DataWatcherManager();

    {
        dataWatcherRegistry = new DataWatcherRegistry();
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BOOLEAN, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BYTE, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.SHORT, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.INT, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.LONG, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.FLOAT, new DataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.DOUBLE, new DataWatcherSerializer<>());
    }

    public DataWatcherRegistry getDataWatcherRegistry(){
        return dataWatcherRegistry;
    }

    @Override
    @Deprecated
    public MetadataUtil getMetadataUtil(){
        return metadataUtil;
    }

    @Override
    public NBTManager getNBTManager() {
        return nbtManager;
    }

    @Override
    public DataWatcherManager getDataWatcherManager() {
        return dataWatcherManager;
    }
}
