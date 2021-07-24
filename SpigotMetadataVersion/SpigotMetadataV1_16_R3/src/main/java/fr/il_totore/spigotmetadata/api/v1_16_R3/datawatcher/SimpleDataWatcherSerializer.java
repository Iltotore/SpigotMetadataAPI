package fr.il_totore.spigotmetadata.api.v1_16_R3.datawatcher;

public class SimpleDataWatcherSerializer<T> extends DataWatcherSerializer<T, T> {

    public SimpleDataWatcherSerializer(net.minecraft.server.v1_16_R3.DataWatcherSerializer<T> handle) {
        super(handle, from -> from, from -> from);
    }

}
