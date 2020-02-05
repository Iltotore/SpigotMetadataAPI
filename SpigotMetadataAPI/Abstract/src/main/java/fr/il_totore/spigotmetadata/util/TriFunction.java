package fr.il_totore.spigotmetadata.util;

@FunctionalInterface
public interface TriFunction<I, J, K, O> {

    O apply(I i, J j, K k);
}
