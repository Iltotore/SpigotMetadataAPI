package fr.il_totore.entitymetadata.api.datawatcher;

import fr.il_totore.entitymetadata.util.ServerVersion;

import java.util.Map;
import java.util.TreeMap;

public class DataWatcherEntry {

    private TreeMap<ServerVersion, VersionEntry> versionEntries = new TreeMap<>(ServerVersion::compareTo);

    /**
     * Add a version support for this {@link DataWatcherEntry}
     * @param entry the given {@link VersionEntry}
     * @return the {@link DataWatcherEntry}
     */
    public DataWatcherEntry addVersion(VersionEntry entry){
        if(hasVersion(entry.getVersion()))
            throw new IllegalArgumentException("Version " + entry.getVersion().toString() + " is already supported");
        versionEntries.put(entry.getVersion(), entry);
        return this;
    }

    /**
     * Remove a version support for this {@link DataWatcherEntry}
     * @param version the given {@link VersionEntry}
     */
    public void removeVersion(ServerVersion version){
        versionEntries.remove(version);
    }

    /**
     * Get a {@link VersionEntry} from his {@link ServerVersion}
     * @param version the given {@link VersionEntry}
     * @return the {@link VersionEntry} associated or null if not present
     */
    public VersionEntry getVersion(ServerVersion version){
        Map.Entry<ServerVersion, VersionEntry> entry = versionEntries.floorEntry(version);
        if(entry == null) return null;
        return entry.getValue();
    }

    /**
     * Check if a {@link VersionEntry} exists for this {@link ServerVersion}
     * @param version the given {@link ServerVersion}
     * @return true if a {@link VersionEntry} with this version exists
     */
    public boolean hasVersion(ServerVersion version){
        return getVersion(version) != null;
    }

    public static final DataWatcherEntry GHAST_ATTACK = new DataWatcherEntry()
            .addVersion(new VersionEntry<>(ServerVersion.v1_8_4, DataWatcherKey.BYTE, 16))
            .addVersion(new VersionEntry<>(ServerVersion.v1_9, DataWatcherKey.BOOLEAN, 11))
            .addVersion(new VersionEntry<>(ServerVersion.v1_10, DataWatcherKey.BOOLEAN, 12));

    public static final DataWatcherEntry BAT_FLY = new DataWatcherEntry()
            .addVersion(new VersionEntry<>(ServerVersion.v1_8_4, DataWatcherKey.BYTE, 16))
            .addVersion(new VersionEntry<>(ServerVersion.v1_9, DataWatcherKey.BYTE, 11))
            .addVersion(new VersionEntry<>(ServerVersion.v1_10, DataWatcherKey.BYTE, 12));


    public static class VersionEntry<T> implements Comparable<VersionEntry<?>> {

        private ServerVersion version;
        private DataWatcherKey<T> key;
        private int index;


        /**
         * Create a new VersionEntry
         * @param version the entry's version
         * @param key the entry's {@link DataWatcherKey}
         * @param index the value/index
         */
        public VersionEntry(ServerVersion version, DataWatcherKey<T> key, int index){
            this.version = version;
            this.key = key;
            this.index = index;
        }

        /**
         * Get entry's version
         * @return the entry's version
         */
        public ServerVersion getVersion(){
            return version;
        }

        /**
         * Get the entry's key
         * @return the entry's key
         */
        public DataWatcherKey<T> getKey(){
            return key;
        }

        /**
         * Get the entry's index
         * @return the entry's index
         */
        public int getIndex(){
            return index;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int compareTo(VersionEntry<?> o){
            return version.compareTo(o.getVersion());
        }
    }
}
