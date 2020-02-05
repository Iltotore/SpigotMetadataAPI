package fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher;

public class DataWatcherObject<T> implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<T, T> {

    private int i;

    public DataWatcherObject(int i){
        this.i = i;
    }

    public int getIndex(){
        return i;
    }

    @Override
    public T bukkitToNotch(T from){
        return from;
    }

    @Override
    public T notchToBukkit(T to){
        return to;
    }
}
