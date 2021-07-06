package fr.il_totore.spigotmetadata.api.v1_17_R1.datawatcher;

import java.util.function.Function;

public class DataWatcherObject<F, T> implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<F, T> {

    private net.minecraft.network.syncher.DataWatcherObject<T> handle;
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherObject(net.minecraft.network.syncher.DataWatcherObject<T> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        this.handle = handle;
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public int getIndex() {
        return handle.a();
    }

    public net.minecraft.network.syncher.DataWatcherObject<T> getHandle() {
        return handle;
    }

    public T bukkitToNotch(F from) {
        return bukkitToNotchFunction.apply(from);
    }

    public F notchToBukkit(T to) {
        return notchToBukkitFunction.apply(to);
    }
}
