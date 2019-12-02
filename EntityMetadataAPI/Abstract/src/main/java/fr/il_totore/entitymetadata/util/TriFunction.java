package fr.il_totore.entitymetadata.util;

@FunctionalInterface
public interface TriFunction<I, J, K, O> {

    O apply(I i, J j, K k);
}
