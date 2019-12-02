package fr.il_totore.entitymetadata.util;

import java.util.function.Function;

@FunctionalInterface
public interface ThrowingFunction<I, O> extends Function<I, O> {

    @Override
    default O apply(I i) {
        try {
            return applyThrow(i);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    O applyThrow(I i) throws Exception;
}
