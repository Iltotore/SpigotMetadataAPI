package fr.il_totore.entitymetadata.api.datawatcher;

public interface DataWatcherSerializer<F, T> {

    /**
     * Get a {@link DataWatcherObject} for the given index
     * @param i the value's index
     * @return a {@link DataWatcherObject} for the given index
     */
    DataWatcherObject<F, T> index(int i);
}
