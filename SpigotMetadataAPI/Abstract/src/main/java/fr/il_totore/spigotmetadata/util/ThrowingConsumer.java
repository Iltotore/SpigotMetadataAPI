package fr.il_totore.spigotmetadata.util;

import java.util.function.Consumer;

@FunctionalInterface
public interface ThrowingConsumer<T> extends Consumer<T> {

    @Override
    default void accept(T t) {
        try {
            acceptThrow(t);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    void acceptThrow(T value) throws Exception;
}
