package fr.il_totore.spigotmetadata.api;

import fr.il_totore.spigotmetadata.util.ServerVersion;
import org.bukkit.Bukkit;

import java.util.TreeMap;
import java.util.function.Supplier;

public class SpigotMetadataAPI {

    private static VersionSpigotMetadataAPI api;
    private static TreeMap<ServerVersion, Supplier<VersionSpigotMetadataAPI>> versions = new TreeMap<>(ServerVersion::compareTo);

    /**
     * Get the {@link VersionSpigotMetadataAPI} instance.
     *
     * @return the {@link VersionSpigotMetadataAPI} instance for the server's version
     */
    public static VersionSpigotMetadataAPI getAPI() {
        if(api == null) {
            ServerVersion version = ServerVersion.fromServer(Bukkit.getServer());
            Bukkit.getLogger().info("[SpigotMetadataAPI] Loading version " + version.getNMSVersion());
            api = versions.get(version).get();
        }
        return api;
    }

    static {
        versions.put(ServerVersion.v1_8_4, fr.il_totore.spigotmetadata.api.v1_8_R3.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_9, fr.il_totore.spigotmetadata.api.v1_9_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_9_4, fr.il_totore.spigotmetadata.api.v1_9_R2.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_10, fr.il_totore.spigotmetadata.api.v1_10_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_11, fr.il_totore.spigotmetadata.api.v1_11_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_12, fr.il_totore.spigotmetadata.api.v1_12_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_13, fr.il_totore.spigotmetadata.api.v1_13_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_13_2, fr.il_totore.spigotmetadata.api.v1_13_R2.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_14, fr.il_totore.spigotmetadata.api.v1_14_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_15, fr.il_totore.spigotmetadata.api.v1_15_R1.VersionSpigotMetadataAPI::new);
        versions.put(ServerVersion.v1_16_1, fr.il_totore.spigotmetadata.api.v1_16_R1.VersionSpigotMetadataAPI::new);
    }

}
