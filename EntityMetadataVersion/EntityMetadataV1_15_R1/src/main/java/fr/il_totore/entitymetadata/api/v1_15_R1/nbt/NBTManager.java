package fr.il_totore.entitymetadata.api.v1_15_R1.nbt;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import fr.il_totore.entitymetadata.api.nbt.NBTBase;
import fr.il_totore.entitymetadata.api.nbt.NBTTagType;
import fr.il_totore.entitymetadata.exception.MojangsonParseException;
import net.minecraft.server.v1_15_R1.MojangsonParser;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class NBTManager implements fr.il_totore.entitymetadata.api.nbt.NBTManager {

    private static Constructor<net.minecraft.server.v1_15_R1.NBTTagEnd> nbtTagEndConstructor;

    static {
        try {
            nbtTagEndConstructor = net.minecraft.server.v1_15_R1.NBTTagEnd.class.getDeclaredConstructor();
            nbtTagEndConstructor.setAccessible(true);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public fr.il_totore.entitymetadata.api.v1_15_R1.nbt.NBTTagCompound getNBTTag(Entity entity) {
        fr.il_totore.entitymetadata.api.v1_15_R1.nbt.NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_15_R1.NBTTagCompound());
        if(entity instanceof Player) {
            ((CraftEntity) entity).getHandle().save(nbt.getHandle());
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
                return (T) new NBTTagByte(net.minecraft.server.v1_15_R1.NBTTagByte.a((Byte) value));

            case 2:
                return (T) new NBTTagShort(net.minecraft.server.v1_15_R1.NBTTagShort.a((Short) value));

            case 3:
                return (T) new NBTTagInt(net.minecraft.server.v1_15_R1.NBTTagInt.a((Integer) value));

            case 4:
                return (T) new NBTTagLong(net.minecraft.server.v1_15_R1.NBTTagLong.a((Long) value));

            case 5:
                return (T) new NBTTagFloat(net.minecraft.server.v1_15_R1.NBTTagFloat.a((Float) value));

            case 6:
                return (T) new NBTTagDouble(net.minecraft.server.v1_15_R1.NBTTagDouble.a((Double) value));

            case 7:
                return (T) new NBTTagByteArray(new net.minecraft.server.v1_15_R1.NBTTagByteArray((byte[]) value));

            case 8:
                return (T) new NBTTagString(net.minecraft.server.v1_15_R1.NBTTagString.a((String) value));

            case 9:
                NBTTagList nbtList = new NBTTagList(new net.minecraft.server.v1_15_R1.NBTTagList());
                nbtList.addAll((Collection<NBTBase>) value);
                return (T) nbtList;

            case 10:
                return (T) new NBTTagCompound(new net.minecraft.server.v1_15_R1.NBTTagCompound());

            case 11:
                return (T) new NBTTagIntArray(new net.minecraft.server.v1_15_R1.NBTTagIntArray((int[]) value));

            default:
                throw new IllegalArgumentException("Unknown type: " + type.getId());
        }
    }

    @Override
    public NBTTagCompound fromString(String string) {
        try {
            return new NBTTagCompound(MojangsonParser.parse(string));
        } catch(CommandSyntaxException e) {
            throw new MojangsonParseException(e.getMessage());
        }
    }

    @Override
    public <T extends NBTBase> T of(NBTTagType<T> type) {
        return of(type, null);
    }
}
