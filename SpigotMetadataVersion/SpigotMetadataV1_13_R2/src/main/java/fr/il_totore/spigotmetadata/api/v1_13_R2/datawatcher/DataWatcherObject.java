package fr.il_totore.spigotmetadata.api.v1_13_R2.datawatcher;

import java.util.function.Function;

public class DataWatcherObject<F, T> implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<F, T> {

    private net.minecraft.server.v1_13_R2.DataWatcherObject<T> handle;
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherObject(net.minecraft.server.v1_13_R2.DataWatcherObject<T> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        this.handle = handle;
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public int getIndex() {
        return handle.a();
    }

    public net.minecraft.server.v1_13_R2.DataWatcherObject<T> getHandle() {
        return handle;
    }

    public T bukkitToNotch(F from) {
        return bukkitToNotchFunction.apply(from);
    }

    public F notchToBukkit(T to) {
        return notchToBukkitFunction.apply(to);
    }
}
