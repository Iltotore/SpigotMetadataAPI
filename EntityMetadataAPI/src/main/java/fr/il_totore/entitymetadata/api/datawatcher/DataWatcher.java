package fr.il_totore.entitymetadata.api.datawatcher;

public interface DataWatcher {

    /***
     * Set the F value at the {@link DataWatcherObject}'s index
     * @param object The {@link DataWatcherObject} used to set the value
     * @param value The F value to set
     * @param <F> The Bukkit value (From)
     * @param <T> The Notch value (To)
     */
    <F, T> void set(DataWatcherObject<F, T> object, F value);

    /**
     * Get the F value at the {@link DataWatcherObject}'s index
     * @param object The {@link DataWatcherObject} used to get the value
     * @param <F> The Bukkit value (From)
     * @param <T> The Notch value (To)
     * @return F value at the {@link DataWatcherObject}'s index
     */
    <F, T> F get(DataWatcherObject<F, T> object);
}
