package fr.il_totore.spigotmetadata.api.datawatcher;

public interface DataWatcherObject<F, T> {

    /**
     * Return the {@link DataWatcherObject}'s index
     * @return Return the {@link DataWatcherObject}'s index
     */
    int getIndex();

    /**
     * Transform the F (From/Bukkit) value to a T (To/Notchian) value
     * @param from T value to transform
     * @return F value transformed
     */
    T bukkitToNotch(F from);

    /**
     * Transformed the T (To/Notchian) value to F (From/Bukkit) value
     * @param to T value to transform
     * @return F value transformed
     */
    F notchToBukkit(T to);
}