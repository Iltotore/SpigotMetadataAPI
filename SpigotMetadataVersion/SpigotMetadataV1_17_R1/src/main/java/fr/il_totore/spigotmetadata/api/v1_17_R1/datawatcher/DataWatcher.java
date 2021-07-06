package fr.il_totore.spigotmetadata.api.v1_17_R1.datawatcher;

public class DataWatcher implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcher {

    private net.minecraft.network.syncher.DataWatcher handle;

    public DataWatcher(net.minecraft.network.syncher.DataWatcher handle) {
        this.handle = handle;
    }

    @Override
    public <F, T> void set(fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<F, T> object, F value) {
        assert object instanceof DataWatcherObject : "Invalid version";
        handle.set(((DataWatcherObject<F, T>) object).getHandle(), object.bukkitToNotch(value));
    }

    @Override
    public <F, T> F get(fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<F, T> object) {
        assert object instanceof DataWatcherObject : "Invalid version";
        return object.notchToBukkit(handle.get(((DataWatcherObject<F, T>) object).getHandle()));
    }

    public net.minecraft.network.syncher.DataWatcher getHandle() {
        return handle;
    }
}
