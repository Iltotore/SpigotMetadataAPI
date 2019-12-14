package fr.il_totore.entitymetadata.api.v1_15_R1.datawatcher;

import com.google.common.base.Optional;

import java.util.function.Function;

public class DataWatcherSerializer<F, T> implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcherSerializer {

    private net.minecraft.server.v1_15_R1.DataWatcherSerializer<T> handle;
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherSerializer(net.minecraft.server.v1_15_R1.DataWatcherSerializer<T> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        this.handle = handle;
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public DataWatcherObject<F, T> index(int i) {
        return new DataWatcherObject<>(handle.a(i), bukkitToNotchFunction, notchToBukkitFunction);
    }

    public net.minecraft.server.v1_15_R1.DataWatcherSerializer<T> getHandle() {
        return handle;
    }


    /*
    Guava to Guava
     */
    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<Optional<T>> handle, DataWatcherSerializer<F, T> from) {
        return optionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(handle, opt -> Optional.fromNullable(bukkitToNotchFunction.apply(opt.get())), opt -> Optional.fromNullable(notchToBukkitFunction.apply(opt.get())));
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<Optional<T>> handle, DataWatcherSerializer<F, T> from) {
        return nullableOptionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(handle, opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(bukkitToNotchFunction.apply(opt.get()));
        }, opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(notchToBukkitFunction.apply(opt.get()));
        });
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, T> optionalRawOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<T> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(handle, opt -> bukkitToNotchFunction.apply(opt.get()), item -> Optional.fromNullable(notchToBukkitFunction.apply(item)));
    }


    /*
    Guava to Java
     */
    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> javaOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<java.util.Optional<T>> handle, DataWatcherSerializer<F, T> from) {
        return javaOptionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> javaOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<java.util.Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(handle, opt -> java.util.Optional.ofNullable(bukkitToNotchFunction.apply(opt.get())), opt -> Optional.fromNullable(notchToBukkitFunction.apply(opt.get())));
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> nullableJavaOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<java.util.Optional<T>> handle, DataWatcherSerializer<F, T> from) {
        return nullableJavaOptionalOf(handle, from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> nullableJavaOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherSerializer<java.util.Optional<T>> handle, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(handle, guava -> {
            if(!guava.isPresent()) return java.util.Optional.empty();
            return java.util.Optional.ofNullable(bukkitToNotchFunction.apply(guava.get()));
        }, java -> {
            if(!java.isPresent()) return Optional.absent();
            return Optional.fromNullable(notchToBukkitFunction.apply(java.get()));
        });
    }
}
