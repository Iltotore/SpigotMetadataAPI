package fr.il_totore.spigotmetadata.util;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface ThrowingBiConsumer<I, O> extends BiConsumer<I, O> {

    @Override
    default void accept(I input, O output) {
        try {
            acceptThrow(input, output);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    void acceptThrow(I input, O output) throws Exception;
}
