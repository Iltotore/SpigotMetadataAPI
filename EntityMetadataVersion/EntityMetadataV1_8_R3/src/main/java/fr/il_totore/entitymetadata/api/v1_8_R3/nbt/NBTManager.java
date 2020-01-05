package fr.il_totore.entitymetadata.api.v1_8_R3.nbt;

import fr.il_totore.entitymetadata.api.nbt.NBTBase;
import fr.il_totore.entitymetadata.api.nbt.NBTSerializer;
import fr.il_totore.entitymetadata.api.nbt.NBTTagType;
import fr.il_totore.entitymetadata.exception.MojangsonParseException;
import net.minecraft.server.v1_8_R3.MojangsonParser;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NBTManager implements fr.il_totore.entitymetadata.api.nbt.NBTManager {

    private static Constructor<net.minecraft.server.v1_8_R3.NBTTagEnd> nbtTagEndConstructor;
    private static Map<NBTTagType<?>, NBTSerializer<?>> serializerMap = new HashMap<>();

    static {
        try {
            nbtTagEndConstructor = net.minecraft.server.v1_8_R3.NBTTagEnd.class.getDeclaredConstructor();
            nbtTagEndConstructor.setAccessible(true);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public fr.il_totore.entitymetadata.api.v1_8_R3.nbt.NBTTagCompound getNBTTag(Entity entity) {
        fr.il_totore.entitymetadata.api.v1_8_R3.nbt.NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_8_R3.NBTTagCompound());
        if(entity instanceof Player) {
            ((CraftEntity) entity).getHandle().e(nbt.getHandle());
        } else {
            if(!((CraftEntity) entity).getHandle().c(nbt.getHandle()))
                throw new IllegalArgumentException("Invalid Entity !");
        }
        return nbt;
    }

    @Override
    public void setNBTTag(Entity entity, fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        ((CraftEntity) entity).getHandle().f(((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    @SuppressWarnings("unchecked")
    public <V, T extends NBTBase> T of(NBTTagType<T> type, @Nullable V value) {
        switch(type.getId()) {
            case 0:
                try {
                    return (T) new NBTTagEnd(nbtTagEndConstructor.newInstance());
                } catch(InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            case 1:
                return (T) new NBTTagByte(new net.minecraft.server.v1_8_R3.NBTTagByte((Byte) value));

            case 2:
                return (T) new NBTTagShort(new net.minecraft.server.v1_8_R3.NBTTagShort((Short) value));

            case 3:
                return (T) new NBTTagInt(new net.minecraft.server.v1_8_R3.NBTTagInt((Integer) value));

            case 4:
                return (T) new NBTTagLong(new net.minecraft.server.v1_8_R3.NBTTagLong((Long) value));

            case 5:
                return (T) new NBTTagFloat(new net.minecraft.server.v1_8_R3.NBTTagFloat((Float) value));

            case 6:
                return (T) new NBTTagDouble(new net.minecraft.server.v1_8_R3.NBTTagDouble((Double) value));

            case 7:
                return (T) new NBTTagByteArray(new net.minecraft.server.v1_8_R3.NBTTagByteArray((byte[]) value));

            case 8:
                return (T) new NBTTagString(new net.minecraft.server.v1_8_R3.NBTTagString((String) value));

            case 9:
                NBTTagList nbtList = new NBTTagList(new net.minecraft.server.v1_8_R3.NBTTagList());
                nbtList.addAll(value == null ? new ArrayList<>() : (Collection<NBTBase>) value);
                return (T) nbtList;

            case 10:
                return (T) new fr.il_totore.entitymetadata.api.v1_8_R3.nbt.NBTTagCompound(new net.minecraft.server.v1_8_R3.NBTTagCompound());

            case 11:
                return (T) new NBTTagIntArray(new net.minecraft.server.v1_8_R3.NBTTagIntArray((int[]) value));

            default:
                throw new IllegalArgumentException("Unknown type: " + type.getId());
        }
    }

    @Override
    public <T extends NBTBase> T of(NBTTagType<T> type) {
        return of(type, null);
    }

    @Override
    public NBTTagCompound fromString(String string) {
        try {
            return new NBTTagCompound(MojangsonParser.parse(string));
        } catch(net.minecraft.server.v1_8_R3.MojangsonParseException e) {
            throw new MojangsonParseException(e.getMessage());
        }
    }
}
