package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

import fr.il_totore.entitymetadata.api.nbt.NBTTagType;

import java.util.Set;

public class NBTTagCompound extends NBTBase<net.minecraft.server.v1_9_R2.NBTTagCompound> implements fr.il_totore.entitymetadata.api.nbt.NBTTagCompound {

    public NBTTagCompound(net.minecraft.server.v1_9_R2.NBTTagCompound handle) {
        super(handle);
    }

    @Override
    public Set<String> toSet() {
        return getHandle().c();
    }

    @Override
    public NBTTagType getType() {
        return NBTTagType.getById(getHandle().getTypeId());
    }

    @Override
    public void setByte(String key, byte b) {
        getHandle().setByte(key, b);
    }

    @Override
    public void setShort(String key, short i) {
        getHandle().setShort(key, i);
    }

    @Override
    public void setInt(String key, int i) {
        getHandle().setInt(key, i);
    }

    @Override
    public void setLong(String key, long l) {
        getHandle().setLong(key, l);
    }

    @Override
    public void setFloat(String key, float v) {
        getHandle().setFloat(key, v);
    }

    @Override
    public void setDouble(String key, double v) {
        getHandle().setDouble(key, v);
    }

    @Override
    public void setString(String key, String s) {
        getHandle().setString(key, s);
    }

    @Override
    public void setByteArray(String key, byte[] bytes) {
        getHandle().setByteArray(key, bytes);
    }

    @Override
    public void setIntArray(String key, int[] ints) {
        getHandle().setIntArray(key, ints);
    }

    @Override
    public void setBoolean(String key, boolean b) {
        getHandle().setBoolean(key, b);
    }

    @Override
    public byte getByte(String key) {
        return getHandle().getByte(key);
    }

    @Override
    public short getShort(String key) {
        return getHandle().getShort(key);
    }

    @Override
    public int getInt(String key) {
        return getHandle().getInt(key);
    }

    @Override
    public long getLong(String key) {
        return getHandle().getLong(key);
    }

    @Override
    public float getFloat(String key) {
        return getHandle().getFloat(key);
    }

    @Override
    public double getDouble(String key) {
        return getHandle().getDouble(key);
    }

    @Override
    public String getString(String key) {
        return getHandle().getString(key);
    }

    @Override
    public byte[] getByteArray(String key) {
        return getHandle().getByteArray(key);
    }

    @Override
    public int[] getIntArray(String key) {
        return getHandle().getIntArray(key);
    }

    @Override
    public NBTTagCompound getCompound(String key) {
        return new NBTTagCompound(getHandle().getCompound(key));
    }

    @Override
    public NBTTagList getList(String key, NBTTagType type) {
        return new NBTTagList(getHandle().getList(key, type.getId()));
    }

    @Override
    public boolean getBoolean(String key) {
        return getHandle().getBoolean(key);
    }

    @Override
    public void remove(String key) {
        getHandle().remove(key);
    }

    @Override
    public NBTTagType getTypeOf(String key) {
        return NBTTagType.getById(getHandle().d(key));
    }

    @Override
    public boolean hasKey(String key) {
        return getHandle().hasKey(key);
    }

    @Override
    public boolean hasKeyOfType(String key, NBTTagType type) {
        return getHandle().hasKeyOfType(key, type.getId());
    }

    @Override
    public NBTTagCompound merge(fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        getHandle().a(((NBTTagCompound) nbtTagCompound).getHandle());
        return this;
    }

    @Override
    public String toString() {
        return getHandle().toString();
    }
}
