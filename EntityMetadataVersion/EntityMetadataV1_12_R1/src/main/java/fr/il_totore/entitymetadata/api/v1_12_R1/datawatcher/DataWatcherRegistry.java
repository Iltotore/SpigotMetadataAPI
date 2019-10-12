package fr.il_totore.entitymetadata.api.v1_12_R1.datawatcher;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherKey;

import java.util.HashMap;
import java.util.Map;

public class DataWatcherRegistry implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherRegistry {

    private Map<DataWatcherKey<?>, DataWatcherSerializer<?, ?>> map = new HashMap<>();

    public <F, T> void registerSerializer(DataWatcherKey<F> key, DataWatcherSerializer<F, T> dataWatcherSerializer) {
        map.put(key, dataWatcherSerializer);
    }

    public void unregisterSerializer(DataWatcherKey<?> key) {
        map.remove(key);
    }

    @SuppressWarnings("unchecked")
    public <F> DataWatcherSerializer<F, ?> getSerializer(DataWatcherKey<F> key) {
        return (DataWatcherSerializer<F, ?>) map.get(key);
    }
}
