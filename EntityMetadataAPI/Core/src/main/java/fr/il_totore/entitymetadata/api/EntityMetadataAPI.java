package fr.il_totore.entitymetadata.api;

import fr.il_totore.entitymetadata.util.ServerVersion;
import org.bukkit.Bukkit;

import java.util.TreeMap;
import java.util.function.Supplier;

public class EntityMetadataAPI {

    private static VersionEntityMetadataAPI api;
    private static TreeMap<ServerVersion, Supplier<VersionEntityMetadataAPI>> versions = new TreeMap<>(ServerVersion::compareTo);

    /**
     * Get the {@link VersionEntityMetadataAPI} instance.
     *
     * @return the {@link VersionEntityMetadataAPI} instance for the server's version
     */
    public static VersionEntityMetadataAPI getAPI(){
        if(api == null){
            ServerVersion version = ServerVersion.fromServer(Bukkit.getServer());
            Bukkit.getLogger().info("[EntityMetadataAPI] Loading version " + version.getNMSVersion());
            api = versions.get(version).get();
        }
        return api;
    }

    static{
        versions.put(ServerVersion.v1_8_4, fr.il_totore.entitymetadata.api.v1_8_R3.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_9, fr.il_totore.entitymetadata.api.v1_9_R1.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_9_4, fr.il_totore.entitymetadata.api.v1_9_R2.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_10, fr.il_totore.entitymetadata.api.v1_10_R1.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_11, fr.il_totore.entitymetadata.api.v1_11_R1.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_12, fr.il_totore.entitymetadata.api.v1_12_R1.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_13, fr.il_totore.entitymetadata.api.v1_13_R1.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_13_2, fr.il_totore.entitymetadata.api.v1_13_R2.VersionEntityMetadataAPI::new);
        versions.put(ServerVersion.v1_14, fr.il_totore.entitymetadata.api.v1_14_R1.VersionEntityMetadataAPI::new);
    }

}
