package fr.il_totore.entitymetadata.api.nbt;

public interface NBTHolder {
    NBTTagCompound getTag();

    void setTag(NBTTagCompound nbt);
}