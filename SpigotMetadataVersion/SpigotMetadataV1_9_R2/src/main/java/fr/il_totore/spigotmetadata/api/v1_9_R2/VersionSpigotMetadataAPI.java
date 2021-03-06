package fr.il_totore.spigotmetadata.api.v1_9_R2;

import fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.spigotmetadata.api.v1_9_R2.datawatcher.DataWatcherManager;
import fr.il_totore.spigotmetadata.api.v1_9_R2.datawatcher.DataWatcherRegistry;
import fr.il_totore.spigotmetadata.api.v1_9_R2.datawatcher.DataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_9_R2.datawatcher.SimpleDataWatcherSerializer;
import fr.il_totore.spigotmetadata.api.v1_9_R2.nbt.NBTManager;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_9_R2.BlockPosition;
import net.minecraft.server.v1_9_R2.EnumDirection;
import net.minecraft.server.v1_9_R2.IChatBaseComponent;
import net.minecraft.server.v1_9_R2.Vector3f;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_9_R2.inventory.CraftItemStack;
import org.bukkit.util.Vector;

public class VersionSpigotMetadataAPI implements fr.il_totore.spigotmetadata.api.VersionSpigotMetadataAPI {

    private DataWatcherRegistry dataWatcherRegistry = new DataWatcherRegistry();
    private MetadataUtil metadataUtil = new MetadataUtil();
    private NBTManager nbtManager = new NBTManager();
    private DataWatcherManager dataWatcherManager = new DataWatcherManager();

    {
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BOOLEAN, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.h));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BYTE, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.a));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.INT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.b));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.FLOAT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.c));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.STRING, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.d));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_UUID, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.m));

        dataWatcherRegistry.registerSerializer(DataWatcherKey.VECTOR, new DataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.i, vector -> new Vector3f((float) vector.getX(), (float) vector.getY(), (float) vector.getZ()), vector3f -> new Vector(vector3f.getX(), vector3f.getY(), vector3f.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.POSITION, new DataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.j, vector -> new BlockPosition(vector.getX(), vector.getY(), vector.getZ()), blockPosition -> new Vector(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_POSITION, DataWatcherSerializer.optionalOf(net.minecraft.server.v1_9_R2.DataWatcherRegistry.k, (DataWatcherSerializer<Vector, BlockPosition>) dataWatcherRegistry.getSerializer(DataWatcherKey.POSITION)));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.CHAT_COMPONENT, new DataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.e, bukkit -> IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(bukkit)), notch -> new TextComponent(ComponentSerializer.parse(IChatBaseComponent.ChatSerializer.a(notch)))));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BLOCK_FACE, new DataWatcherSerializer<>(net.minecraft.server.v1_9_R2.DataWatcherRegistry.l, bukkit -> EnumDirection.valueOf(bukkit.name()), notch -> BlockFace.valueOf(notch.name())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_ITEM_STACK, DataWatcherSerializer.nullableOptionalOf(net.minecraft.server.v1_9_R2.DataWatcherRegistry.f, CraftItemStack::asNMSCopy, CraftItemStack::asBukkitCopy));
    }

    @Override
    public DataWatcherRegistry getDataWatcherRegistry(){
        return dataWatcherRegistry;
    }

    @Override
    @Deprecated
    public MetadataUtil getMetadataUtil(){
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
