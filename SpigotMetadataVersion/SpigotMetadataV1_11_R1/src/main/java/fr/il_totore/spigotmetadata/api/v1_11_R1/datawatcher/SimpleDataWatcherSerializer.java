package fr.il_totore.spigotmetadata.api.v1_11_R1.datawatcher;

public class SimpleDataWatcherSerializer<T> extends DataWatcherSerializer<T, T> {

    public SimpleDataWatcherSerializer(net.minecraft.server.v1_11_R1.DataWatcherSerializer<T> handle) {
        super(handle, from -> from, from -> from);
    }

}
