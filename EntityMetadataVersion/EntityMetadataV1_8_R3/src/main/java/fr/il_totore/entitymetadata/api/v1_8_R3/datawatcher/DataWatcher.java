package fr.il_totore.entitymetadata.api.v1_8_R3.datawatcher;

import java.lang.reflect.InvocationTargetException;


public class DataWatcher implements fr.il_totore.entitymetadata.api.datawatcher.DataWatcher {

    private net.minecraft.server.v1_8_R3.DataWatcher handle;

    public DataWatcher(net.minecraft.server.v1_8_R3.DataWatcher handle){
        this.handle = handle;
    }

    @Override
    public <F,T> void set(fr.il_totore.entitymetadata.api.datawatcher.DataWatcherObject<F, T> object, F value){
        assert object instanceof DataWatcherObject : "Invalid version";
        handle.watch(object.getIndex(), value);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <F, T> F get(fr.il_totore.entitymetadata.api.datawatcher.DataWatcherObject<F, T> object){
        try{
            return object.notchToBukkit((T) ((net.minecraft.server.v1_8_R3.DataWatcher.WatchableObject) DataWatcherRegistry.getValue.invoke(handle, object.getIndex())).b());
        } catch(IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }

    public net.minecraft.server.v1_8_R3.DataWatcher getHandle(){
        return handle;
    }

}
