package fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher;

import com.google.common.base.Optional;

import java.util.function.Function;

public class DataWatcherSerializer<F, T> implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherSerializer<F, T> {
    
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherSerializer(Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public DataWatcherObject<F, T> index(int i) {
        return new DataWatcherObject<>(i, bukkitToNotchFunction, notchToBukkitFunction);
    }


    /*
    Guava to Guava
     */
    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(DataWatcherSerializer<F, T> from) {
        return optionalOf(from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> optionalOf(Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(opt -> Optional.fromNullable(bukkitToNotchFunction.apply(opt.get())), opt -> Optional.fromNullable(notchToBukkitFunction.apply(opt.get())));
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(DataWatcherSerializer<F, T> from) {
        return nullableOptionalOf(from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, Optional<T>> nullableOptionalOf(Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(bukkitToNotchFunction.apply(opt.get()));
        }, opt -> {
            if(!opt.isPresent()) return Optional.absent();
            return Optional.fromNullable(notchToBukkitFunction.apply(opt.get()));
        });
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, T> optionalRawOf( Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(opt -> bukkitToNotchFunction.apply(opt.get()), item -> Optional.fromNullable(notchToBukkitFunction.apply(item)));
    }


    /*
    Guava to Java
     */
    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> javaOptionalOf(DataWatcherSerializer<F, T> from) {
        return javaOptionalOf(from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> javaOptionalOf(Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(opt -> java.util.Optional.ofNullable(bukkitToNotchFunction.apply(opt.get())), opt -> Optional.fromNullable(notchToBukkitFunction.apply(opt.get())));
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> nullableJavaOptionalOf(DataWatcherSerializer<F, T> from) {
        return nullableJavaOptionalOf(from.bukkitToNotchFunction, from.notchToBukkitFunction);
    }

    public static <F, T> DataWatcherSerializer<Optional<F>, java.util.Optional<T>> nullableJavaOptionalOf(Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        return new DataWatcherSerializer<>(guava -> {
            if(!guava.isPresent()) return java.util.Optional.empty();
            return java.util.Optional.ofNullable(bukkitToNotchFunction.apply(guava.get()));
        }, java -> {
            if(!java.isPresent()) return Optional.absent();
            return Optional.fromNullable(notchToBukkitFunction.apply(java.get()));
        });
    }
}
