package fr.il_totore.entitymetadata.api.v1_9_R2.nbt;

import fr.il_totore.entitymetadata.api.nbt.NBTBase;
import fr.il_totore.entitymetadata.api.nbt.NBTTagType;
import fr.il_totore.entitymetadata.exception.MojangsonParseException;
import net.minecraft.server.v1_9_R2.BlockPosition;
import net.minecraft.server.v1_9_R2.MojangsonParser;
import net.minecraft.server.v1_9_R2.TileEntity;
import net.minecraft.server.v1_9_R2.World;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_9_R2.CraftWorld;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_9_R2.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

public class NBTManager implements fr.il_totore.entitymetadata.api.nbt.NBTManager {

    private static Constructor<net.minecraft.server.v1_9_R2.NBTTagEnd> nbtTagEndConstructor;

    static {
        try {
            nbtTagEndConstructor = net.minecraft.server.v1_9_R2.NBTTagEnd.class.getDeclaredConstructor();
            nbtTagEndConstructor.setAccessible(true);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public fr.il_totore.entitymetadata.api.v1_9_R2.nbt.NBTTagCompound getNBTTag(Entity entity) {
        fr.il_totore.entitymetadata.api.v1_9_R2.nbt.NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_9_R2.NBTTagCompound());
        if(entity instanceof Player) {
            ((CraftEntity) entity).getHandle().e(nbt.getHandle());
        } else {
            if(!((CraftEntity) entity).getHandle().c(nbt.getHandle()))
                throw new IllegalArgumentException("Invalid Entity !");
        }
        return nbt;
    }

    @Override
    public fr.il_totore.entitymetadata.api.nbt.NBTTagCompound getNBTTag(ItemStack itemStack) {
        net.minecraft.server.v1_9_R2.ItemStack nmsItem = CraftItemStack.asNMSCopy(itemStack);
        fr.il_totore.entitymetadata.api.v1_9_R2.nbt.NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_9_R2.NBTTagCompound());
        nmsItem.save(nbt.getHandle());
        return nbt;
    }

    @Override
    public fr.il_totore.entitymetadata.api.nbt.NBTTagCompound getNBTTag(Location location) {
        fr.il_totore.entitymetadata.api.v1_9_R2.nbt.NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_9_R2.NBTTagCompound());
        World world = ((CraftWorld) location.getWorld()).getHandle();
        TileEntity tileEntity = world.getTileEntity(new BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ()));
        tileEntity.save(nbt.getHandle());
        return nbt;
    }

    @Override
    public fr.il_totore.entitymetadata.api.nbt.NBTTagCompound getNBTTag(Block block) {
        return getNBTTag(block.getLocation());
    }

    @Override
    public void setNBTTag(Entity entity, fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        ((CraftEntity) entity).getHandle().f(((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    public void setNBTTag(ItemStack itemStack, fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        net.minecraft.server.v1_9_R2.ItemStack nmsItem = CraftItemStack.asNMSCopy(itemStack);
        nmsItem.c(((NBTTagCompound) nbtTagCompound).getHandle());
        itemStack.setItemMeta(CraftItemStack.getItemMeta(nmsItem));
    }

    @Override
    public void setNBTTag(Location location, fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        World world = ((CraftWorld) location.getWorld()).getHandle();
        TileEntity tileEntity = world.getTileEntity(new BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ()));
        tileEntity.a(((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    public void setNBTTag(Block block, fr.il_totore.entitymetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        setNBTTag(block.getLocation(), nbtTagCompound);
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
                return (T) new NBTTagByte(new net.minecraft.server.v1_9_R2.NBTTagByte((Byte) value));

            case 2:
                return (T) new NBTTagShort(new net.minecraft.server.v1_9_R2.NBTTagShort((Short) value));

            case 3:
                return (T) new NBTTagInt(new net.minecraft.server.v1_9_R2.NBTTagInt((Integer) value));

            case 4:
                return (T) new NBTTagLong(new net.minecraft.server.v1_9_R2.NBTTagLong((Long) value));

            case 5:
                return (T) new NBTTagFloat(new net.minecraft.server.v1_9_R2.NBTTagFloat((Float) value));

            case 6:
                return (T) new NBTTagDouble(new net.minecraft.server.v1_9_R2.NBTTagDouble((Double) value));

            case 7:
                return (T) new NBTTagByteArray(new net.minecraft.server.v1_9_R2.NBTTagByteArray((byte[]) value));

            case 8:
                return (T) new NBTTagString(new net.minecraft.server.v1_9_R2.NBTTagString((String) value));

            case 9:
                NBTTagList nbtList = new NBTTagList(new net.minecraft.server.v1_9_R2.NBTTagList());
                nbtList.addAll(value == null ? new ArrayList<>() : (Collection<NBTBase>) value);
                return (T) nbtList;

            case 10:
                return (T) new NBTTagCompound(new net.minecraft.server.v1_9_R2.NBTTagCompound());

            case 11:
                return (T) new NBTTagIntArray(new net.minecraft.server.v1_9_R2.NBTTagIntArray((int[]) value));

            default:
                throw new IllegalArgumentException("Unknown type: " + type.getId());
        }
    }

    @Override
    public NBTTagCompound fromString(String string) {
        try {
            return new NBTTagCompound(MojangsonParser.parse(string));
        } catch(net.minecraft.server.v1_9_R2.MojangsonParseException e) {
            throw new MojangsonParseException(e.getMessage());
        }
    }

    @Override
    public <T extends NBTBase> T of(NBTTagType<T> type) {
        return of(type, null);
    }
}
