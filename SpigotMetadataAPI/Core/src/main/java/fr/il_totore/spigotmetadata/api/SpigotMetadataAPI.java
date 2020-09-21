package fr.il_totore.spigotmetadata.api;

import fr.il_totore.spigotmetadata.util.ServerVersion;
import org.bukkit.Bukkit;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;

public class SpigotMetadataAPI {

    private static VersionSpigotMetadataAPI api;

    /**
     * Get the {@link VersionSpigotMetadataAPI} instance.
     *
     * @return the {@link VersionSpigotMetadataAPI} instance for the server's version
     */
    public static VersionSpigotMetadataAPI getAPI() {
        if(api == null) {
            ServerVersion version = ServerVersion.fromServer(Bukkit.getServer());
            Bukkit.getLogger().info("[SpigotMetadataAPI] Loading version " + version.getNMSVersion() + "...");
            try {
             api = (VersionSpigotMetadataAPI) Class.forName("fr.il_totore.spigotmetadata.api." + version.getNMSVersion() + ".VersionSpigotMetadataAPI")
                     .newInstance();
            } catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
                throw new IllegalStateException("This version is not supported", e);
            }
        }
        return api;
    }

}
