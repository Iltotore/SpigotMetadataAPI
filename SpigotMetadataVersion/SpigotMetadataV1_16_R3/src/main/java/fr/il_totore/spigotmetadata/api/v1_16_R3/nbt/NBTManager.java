package fr.il_totore.spigotmetadata.api.v1_16_R3.nbt;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import fr.il_totore.spigotmetadata.api.nbt.NBTBase;
import fr.il_totore.spigotmetadata.api.nbt.NBTTagType;
import fr.il_totore.spigotmetadata.exception.MojangsonParseException;
import net.minecraft.server.v1_16_R3.BlockPosition;
import net.minecraft.server.v1_16_R3.MojangsonParser;
import net.minecraft.server.v1_16_R3.TileEntity;
import net.minecraft.server.v1_16_R3.World;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

public class NBTManager implements fr.il_totore.spigotmetadata.api.nbt.NBTManager {

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
    public fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound getNBTTag(ItemStack itemStack) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_16_R3.NBTTagCompound());
        nmsItem.save(nbt.getHandle());
        return nbt;
    }

    @Override
    public fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound getNBTTag(Location location) {
        NBTTagCompound nbt = new NBTTagCompound(new net.minecraft.server.v1_16_R3.NBTTagCompound());
        World world = ((CraftWorld) location.getWorld()).getHandle();
        TileEntity tileEntity = world.getTileEntity(new BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ()));
        if(tileEntity == null)
            throw new IllegalArgumentException("The block at the targeted location is not a tile entity.");
        tileEntity.save(nbt.getHandle());
        return nbt;
    }

    @Override
    public fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound getNBTTag(Block block) {
        return getNBTTag(block.getLocation());
    }

    @Override
    public void setNBTTag(Entity entity, fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        ((CraftEntity) entity).getHandle().load(((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    public void setNBTTag(ItemStack itemStack, fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(itemStack);
        nmsItem.setTag(((NBTTagCompound) nbtTagCompound).getHandle());
        itemStack.setItemMeta(CraftItemStack.getItemMeta(nmsItem));
    }

    @Override
    public void setNBTTag(Location location, fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound nbtTagCompound) {
        World world = ((CraftWorld) location.getWorld()).getHandle();
        TileEntity tileEntity = world.getTileEntity(new BlockPosition(location.getBlockX(), location.getBlockY(), location.getBlockZ()));
        if(tileEntity == null)
            throw new IllegalArgumentException("The block at the targeted location is not a tile entity.");
        tileEntity.load(tileEntity.getBlock(), ((NBTTagCompound) nbtTagCompound).getHandle());
    }

    @Override
    public void setNBTTag(Block block, fr.il_totore.spigotmetadata.api.nbt.NBTTagCompound nbtTagCompound) {
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
                NBTTagList nbtList = new NBTTagList(new net.minecraft.server.v1_16_R3.NBTTagList());
                nbtList.addAll(value == null ? new ArrayList<>() : (Collection<NBTBase>) value);
                return (T) nbtList;

            case 10:
                return (T) new NBTTagCompound(new net.minecraft.server.v1_16_R3.NBTTagCompound());

            case 11:
                return (T) new NBTTagIntArray(new net.minecraft.server.v1_16_R3.NBTTagIntArray((int[]) value));

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
