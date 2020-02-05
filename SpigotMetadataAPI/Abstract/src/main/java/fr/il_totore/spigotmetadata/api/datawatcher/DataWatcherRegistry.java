package fr.il_totore.spigotmetadata.api.datawatcher;


public interface DataWatcherRegistry {

    /**
     * Get the {@link DataWatcherSerializer} put with the given key.
     * @param key the key associated with the wanted serializer
     * @param <F> the 'From' type of the {@link DataWatcherKey}
     * @return the {@link DataWatcherSerializer} put with the given key or null if absent
     */
    <F> DataWatcherSerializer<F, ?> getSerializer(DataWatcherKey<F> key);
}
