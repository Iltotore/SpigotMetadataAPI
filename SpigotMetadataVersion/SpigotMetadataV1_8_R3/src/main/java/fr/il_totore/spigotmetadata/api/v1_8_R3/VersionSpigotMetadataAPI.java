package fr.il_totore.spigotmetadata.api.v1_8_R3;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher.DataWatcherManager;
import fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher.DataWatcherRegistry;
import fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher.DataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher.SimpleDataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_8_R3.nbt.NBTManager;
import net.minecraft.server.v1_8_R3.BlockPosition;
import org.bukkit.util.Vector;

public class VersionSpigotMetadataAPI implements fr.il_totore.spigotmetadata.api.VersionSpigotMetadataAPI {

    private DataWatcherRegistry dataWatcherRegistry;
    private MetadataUtil metadataUtil = new MetadataUtil();
    private NBTManager nbtManager = new NBTManager();
    private DataWatcherManager dataWatcherManager = new DataWatcherManager();

    {
        dataWatcherRegistry = new DataWatcherRegistry();
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BOOLEAN, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BYTE, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.SHORT, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.INT, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.LONG, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.FLOAT, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.DOUBLE, new SimpleDataWatcherSerializer<>());
        dataWatcherRegistry.registerSerializer(DataWatcherKey.POSITION, new DataWatcherSerializer<Vector, BlockPosition>(vector -> new BlockPosition(vector.getX(), vector.getY(), vector.getZ()), blockPosition -> new Vector(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ())));
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
