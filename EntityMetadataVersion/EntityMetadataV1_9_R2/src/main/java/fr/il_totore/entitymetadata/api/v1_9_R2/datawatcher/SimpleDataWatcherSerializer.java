package fr.il_totore.entitymetadata.api.v1_9_R2.datawatcher;

public class SimpleDataWatcherSerializer<T> extends DataWatcherSerializer<T, T> {

    public SimpleDataWatcherSerializer(net.minecraft.server.v1_9_R2.DataWatcherSerializer<T> handle) {
        super(handle, from -> from, from -> from);
    }

}
