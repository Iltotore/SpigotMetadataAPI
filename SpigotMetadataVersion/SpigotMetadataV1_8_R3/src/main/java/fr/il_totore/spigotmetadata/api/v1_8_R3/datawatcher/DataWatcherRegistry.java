package fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherKey;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class DataWatcherRegistry implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherRegistry {

    static Method getValue;

    {
        try{
            getValue = net.minecraft.server.v1_8_R3.DataWatcher.class.getDeclaredMethod("j", int.class);
            getValue.setAccessible(true);
        } catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    private Map<DataWatcherKey<?>, DataWatcherSerializer<?>> map = new HashMap<>();

    public <T> void registerSerializer(DataWatcherKey<T> key, DataWatcherSerializer<T> dataWatcherSerializer){
        map.put(key, dataWatcherSerializer);
    }

    public void unregisterSerializer(DataWatcherKey<?> key){
        map.remove(key);
    }

    @SuppressWarnings("unchecked")
    public <T> DataWatcherSerializer<T> getSerializer(DataWatcherKey<T> key){
        return (DataWatcherSerializer<T>) map.get(key);
    }
}
