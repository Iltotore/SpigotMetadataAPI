package fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher;

public class SimpleDataWatcherSerializer<T> extends DataWatcherSerializer<T, T> {

    public SimpleDataWatcherSerializer() {
        super(from -> from, from -> from);
    }

}
