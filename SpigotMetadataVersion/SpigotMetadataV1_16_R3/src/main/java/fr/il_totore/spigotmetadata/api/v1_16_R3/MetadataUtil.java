package fr.il_totore.spigotmetadata.api.v1_16_R3;

import fr.il_totore.spigotmetadata.api.nbt.NBTBase;
import fr.il_totore.spigotmetadata.api.nbt.NBTTagType;
import fr.il_totore.spigotmetadata.api.v1_16_R3.datawatcher.DataWatcher;
import fr.il_totore.spigotmetadata.api.v1_16_R3.nbt.*;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Deprecated
public class MetadataUtil implements fr.il_totore.spigotmetadata.api.MetadataUtil {

    private static Constructor<net.minecraft.server.v1_16_R3.NBTTagEnd> nbtTagEndConstructor;

    static {
        try {
            nbtTagEndConstructor = net.minecraft.server.v1_16_R3.NBTTagEnd.class.getDeclaredConstructor();
            nbtTagEndConstructor.setAccessible(true);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public DataWatcher getDataWatcher(Entity entity) {
        return new DataWatcher(((CraftEntity) entity).getHandle().getDataWatcher());
    }

    @Override
    public NBTTagCompound getNBTTag(Entity entity) {
        NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_16_R3.NBTTagCompound());
        if(entity instanceof Player) {
            ((CraftEntity) entity).getHandle().save(nbt.getHandle());
        } else {
            if(!((CraftEntity) entity).getHandle().a_(nbt.getHandle()))
                throw new IllegalArgumentException("Invalid Entity !");
        }
        return nbt;
    }

    @Override
    public void setNBTTag(Entity entity, fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        ((CraftEntity) entity).getHandle().load(((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    @SuppressWarnings("unchecked")
    public <V, T extends NBTBase> T nbtOf(NBTTagType<T> type, @Nullable V value) {
        switch(type.getId()) {
            case 0:
                try {
                    return (T) new NBTTagEnd(nbtTagEndConstructor.newInstance());
                } catch(InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            case 1:
                return (T) new NBTTagByte(net.minecraft.server.v1_16_R3.NBTTagByte.a((Byte) value));

            case 2:
                return (T) new NBTTagShort(net.minecraft.server.v1_16_R3.NBTTagShort.a((Short) value));

            case 3:
                return (T) new NBTTagInt(net.minecraft.server.v1_16_R3.NBTTagInt.a((Integer) value));

            case 4:
                return (T) new NBTTagLong(net.minecraft.server.v1_16_R3.NBTTagLong.a((Long) value));

            case 5:
                return (T) new NBTTagFloat(net.minecraft.server.v1_16_R3.NBTTagFloat.a((Float) value));

            case 6:
                return (T) new NBTTagDouble(net.minecraft.server.v1_16_R3.NBTTagDouble.a((Double) value));

            case 7:
                return (T) new NBTTagByteArray(new net.minecraft.server.v1_16_R3.NBTTagByteArray((byte[]) value));

            case 8:
                return (T) new NBTTagString(net.minecraft.server.v1_16_R3.NBTTagString.a((String) value));

            case 9:
                return (T) new NBTTagList(new net.minecraft.server.v1_16_R3.NBTTagList());

            case 10:
                return (T) new NBTTagCompound(new net.minecraft.server.v1_16_R3.NBTTagCompound());

            case 11:
                return (T) new NBTTagIntArray(new net.minecraft.server.v1_16_R3.NBTTagIntArray((int[]) value));

            default:
                throw new IllegalArgumentException("Unknown type: " + type.getId());
        }
    }

    public <T extends NBTBase> T nbtOf(NBTTagType<T> type) {
        return nbtOf(type, null);
    }

}
