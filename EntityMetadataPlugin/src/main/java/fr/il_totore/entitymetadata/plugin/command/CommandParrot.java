package fr.il_totore.entitymetadata.plugin.command;

import fr.il_totore.entitymetadata.api.EntityMetadataAPI;
import fr.il_totore.entitymetadata.api.VersionEntityMetadataAPI;
import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandParrot implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        Player player = (Player) sender;
        VersionEntityMetadataAPI api = EntityMetadataAPI.getAPI();

        Parrot parrot = new ArrayList<>(player.getWorld().getEntitiesByClass(Parrot.class)).get(0);

        NBTTagCompound parrotNbt = api.getNBTManager().getNBTTag(parrot);
        api.getDataWatcherManager().getDataWatcher(player).set(api.getDataWatcherRegistry().getSerializer(DataWatcherKey.NBT_TAG).index(16), parrotNbt);

        return false;
    }
}
