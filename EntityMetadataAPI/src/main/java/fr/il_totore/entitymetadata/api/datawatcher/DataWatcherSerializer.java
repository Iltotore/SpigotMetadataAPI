package fr.il_totore.entitymetadata.api.datawatcher;

public interface DataWatcherSerializer<F, T> {

    /**
     *
     * @param i
     * @return
     */
    DataWatcherObject<F, T> index(int i);
}
