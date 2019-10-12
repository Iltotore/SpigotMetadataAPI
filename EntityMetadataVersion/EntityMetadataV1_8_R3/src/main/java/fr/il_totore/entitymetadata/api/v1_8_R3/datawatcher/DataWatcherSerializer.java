package fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher;

public class DataWatcherSerializer<T> implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherSerializer {

    public DataWatcherObject<T> index(int i){
        return new DataWatcherObject<>(i);
    }
}
