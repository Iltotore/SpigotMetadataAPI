package fr.il_totore.entitymetadata.api.v1_11_R1;

import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.entitymetadata.api.v1_11_R1.datawatcher.DataWatcherRegistry;
import fr.il_totore.entitymetadata.api.v1_11_R1.datawatcher.DataWatcherSerializer;
import fr.il_totore.entitymetadata.api.v1_11_R1.datawatcher.SimpleDataWatcherSerializer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_11_R1.BlockPosition;
import net.minecraft.server.v1_11_R1.EnumDirection;
import net.minecraft.server.v1_11_R1.IChatBaseComponent;
import net.minecraft.server.v1_11_R1.Vector3f;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_11_R1.inventory.CraftItemStack;
import org.bukkit.util.Vector;

public class VersionEntityMetadataAPI implements fr.il_totore.entitymetadata.api.VersionEntityMetadataAPI {

    private DataWatcherRegistry dataWatcherRegistry = new DataWatcherRegistry();
    private MetadataUtil metadataUtil = new MetadataUtil();


    {
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BOOLEAN, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.h));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BYTE, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.a));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.INT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.b));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.FLOAT, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.c));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.STRING, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.d));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_UUID, new SimpleDataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.m));

        dataWatcherRegistry.registerSerializer(DataWatcherKey.VECTOR, new DataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.i, vector -> new Vector3f((float) vector.getX(), (float) vector.getY(), (float) vector.getZ()), vector3f -> new Vector(vector3f.getX(), vector3f.getY(), vector3f.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.POSITION, new DataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.j, vector -> new BlockPosition(vector.getX(), vector.getY(), vector.getZ()), blockPosition -> new Vector(blockPosition.getX(), blockPosition.getY(), blockPosition.getZ())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_POSITION, DataWatcherSerializer.optionalOf(net.minecraft.server.v1_11_R1.DataWatcherRegistry.k, (DataWatcherSerializer<Vector, BlockPosition>) dataWatcherRegistry.getSerializer(DataWatcherKey.POSITION)));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.CHAT_COMPONENT, new DataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.e, bukkit -> IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(bukkit)), notch -> new TextComponent(ComponentSerializer.parse(IChatBaseComponent.ChatSerializer.a(notch)))));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.BLOCK_FACE, new DataWatcherSerializer<>(net.minecraft.server.v1_11_R1.DataWatcherRegistry.l, bukkit -> EnumDirection.valueOf(bukkit.name()), notch -> BlockFace.valueOf(notch.name())));
        dataWatcherRegistry.registerSerializer(DataWatcherKey.OPTIONAL_ITEM_STACK, DataWatcherSerializer.optionalRawOf(net.minecraft.server.v1_11_R1.DataWatcherRegistry.f, CraftItemStack::asNMSCopy, CraftItemStack::asBukkitCopy));
    }

    public DataWatcherRegistry getDataWatcherRegistry(){
        return dataWatcherRegistry;
    }

    @Override
    public MetadataUtil getMetadataUtil(){
        return metadataUtil;
    }
}
