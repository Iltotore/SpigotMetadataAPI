package fr.il_totore.entitymetadata.api.v1_9_R1.datawatcher;

import com.google.common.base.Optional;

import java.util.function.Function;

public class DataWatcherSerializer<F, T> implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherSerializer {

    private net.minecraft.server.v1_9_R1.DataWatcherSerializer<T> handle;
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherSerializer(net.minecraft.server.v1_9_R1.DataWatcherSerializer<T> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction){
        this.handle = handle;
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public DataWatcherObject<F, T> index(int i){
        return new DataWatcherObject<>(handle.a(i), bukkitToNotchFunction, notchToBukkitFunction);
    }

    public net.minecraft.server.v1_9_R1.DataWatcherSerializer<T> getHandle(){
        return handle;
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(net.minecraft.server.v1_9_R1.DataWatcherSerializer<Optional<T>> handle, DataWatcherSerializer<F, T> from){
        return optionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(net.minecraft.server.v1_9_R1.DataWatcherSerializer<Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction){
        return new DataWatcherSerializer<>(handle, opt -> Optional.fromNullable(bukkitToNotchFunction.apply(opt.get())), opt -> Optional.fromNullable(notchToBukkitFunction.apply(opt.get())));
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(net.minecraft.server.v1_9_R1.DataWatcherSerializer<Optional<T>> handle, DataWatcherSerializer<F, T> from){
        return nullableOptionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(net.minecraft.server.v1_9_R1.DataWatcherSerializer<Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction){
        return new DataWatcherSerializer<>(handle, opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(bukkitToNotchFunction.apply(opt.get()));
        }, opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(notchToBukkitFunction.apply(opt.get()));
        });
    }
}
