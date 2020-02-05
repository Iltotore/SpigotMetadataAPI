package fr.il_totore.spigotmetadata.api.v1_15_R1;

import com.google.common.base.Optional;
import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.spigotmetadata.api.v1_15_R1.datawatcher.DataWatcherManager;
import fr.il_totore.spigotmetadata.api.v1_15_R1.datawatcher.DataWatcherRegistry;
import fr.il_totore.spigotmetadata.api.v1_15_R1.datawatcher.DataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_15_R1.datawatcher.SimpleDataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_15_R1.nbt.NBTManager;
import fr.il_totore.spigotmetadata.api.v1_15_R1.nbt.NBTTagCompound;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_15_R1.BlockPosition;
import net.minecraft.server.v1_15_R1.EnumDirection;
import net.minecraft.server.v1_15_R1.IChatBaseComponent;
import net.minecraft.server.v1_15_R1.Vector3f;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_15_R1.inventory.CraftItemStack;
import org.bukkit.util.Vector;

public class VersionSpigotMetadataAPI implements fr.il_totore.spigotmetadata.api.VersionSpigotMetadataAPI {

    private DataWatcherRegistry dataWatcherRegistry = new DataWatcherRegistry();
    private MetadataUtil metadataUtil = new MetadataUtil();
    private NBTManager nbtManager = new NBTManager();
    private DataWatcherManager dataWatcherManager = new DataWatcherManager();

    {
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BOOLEAN, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.i));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BYTE, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.a));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.INT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.b));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.FLOAT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.c));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.STRING, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.d));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_UUID, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.o, guava -> guava.toJavaUtil(), java -> Optional.fromJavaUtil(java)));

        dataWatcherRegistry.registerSerializer(DataWatcherKey.VECTOR, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.k, vector -> new Vector3f((float) vector.getX(), (float) vector.getY(), (float) vector.getZ()), vector3f -> new Vector(vector3f.getX(), vector3f.getY(), vector3f.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.POSITION, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.l, vector -> new BlockPosition(vector.getX(), vector.getY(), vector.getZ()), blockPosition -> new Vector(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_POSITION, DataWatcherSerializer.javaOptionalOf(net.minecraft.server.v1_15_R1.DataWatcherRegistry.m, (DataWatcherSerializer<Vector, BlockPosition>) dataWatcherRegistry.getSerializer(DataWatcherKey.POSITION)));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.CHAT_COMPONENT, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.e, bukkit -> IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(bukkit)), notch -> new TextComponent(ComponentSerializer.parse(IChatBaseComponent.ChatSerializer.a(notch)))));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BLOCK_FACE, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.n, bukkit -> EnumDirection.valueOf(bukkit.name()), notch -> BlockFace.valueOf(notch.name())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_ITEM_STACK, DataWatcherSerializer.optionalRawOf(net.minecraft.server.v1_15_R1.DataWatcherRegistry.g, CraftItemStack::asNMSCopy, CraftItemStack::asBukkitCopy));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.NBT_TAG, new DataWatcherSerializer<>(net.minecraft.server.v1_15_R1.DataWatcherRegistry.p, bukkit -> ((NBTTagCompound) bukkit).getHandle(), NBTTagCompound::new));
    }

    @Override
    public DataWatcherRegistry getDataWatcherRegistry() {
        return dataWatcherRegistry;
    }

    @Override
    @Deprecated
    public MetadataUtil getMetadataUtil() {
        return metadataUtil;
    }

    @Override
    public NBTManager getNBTManager() {
        return nbtManager;
    }

    @Override
    public DataWatcherManager getDataWatcherManager() {
        return dataWatcherManager;
    }
}
