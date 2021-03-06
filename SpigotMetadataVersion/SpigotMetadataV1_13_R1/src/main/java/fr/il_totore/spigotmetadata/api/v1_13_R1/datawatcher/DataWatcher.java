package fr.il_totore.spigotmetadata.api.v1_13_R1.datawatcher;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject;

public class DataWatcher implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcher {

    private net.minecraft.server.v1_13_R1.DataWatcher handle;

    public DataWatcher(net.minecraft.server.v1_13_R1.DataWatcher handle) {
        this.handle = handle;
    }

    @Override
    public <F, T> void set(DataWatcherObject<F, T> object, F value) {
        assert object instanceof fr.il_totore.spigotmetadata.api.v1_13_R1.datawatcher.DataWatcherObject : "Invalid version";
        handle.set(((fr.il_totore.spigotmetadata.api.v1_13_R1.datawatcher.DataWatcherObject<F, T>) object).getHandle(), object.bukkitToNotch(value));
    }

    @Override
    public <F, T> F get(DataWatcherObject<F, T> object) {
        assert object instanceof fr.il_totore.spigotmetadata.api.v1_13_R1.datawatcher.DataWatcherObject : "Invalid version";
        return object.notchToBukkit(handle.get(((fr.il_totore.spigotmetadata.api.v1_13_R1.datawatcher.DataWatcherObject<F, T>) object).getHandle()));
    }

    public net.minecraft.server.v1_13_R1.DataWatcher getHandle() {
        return handle;
    }
}
