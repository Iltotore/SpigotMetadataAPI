package fr.il_totore.spigotmetadata.api.v1_17_R1.datawatcher;

public class SimpleDataWatcherSerializer<T> extends DataWatcherSerializer<T, T> {

    public SimpleDataWatcherSerializer(net.minecraft.network.syncher.DataWatcherSerializer<T> handle) {
        super(handle, from -> from, from -> from);
    }

}
