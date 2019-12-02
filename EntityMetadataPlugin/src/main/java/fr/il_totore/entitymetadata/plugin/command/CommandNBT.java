package fr.il_totore.entitymetadata.plugin.command;

import fr.il_totore.entitymetadata.api.EntityMetadataAPI;
import fr.il_totore.entitymetadata.api.VersionEntityMetadataAPI;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandNBT implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        VersionEntityMetadataAPI api = EntityMetadataAPI.getAPI();

        StringBuilder stringBuilder = new StringBuilder(args[0]);
        if(args.length > 1) for(int i = 1; i < args.length-1; i++){
            stringBuilder.append(" ").append(args[i]);
        }
        NBTTagCompound nbtTagCompound = api.getNBTManager().getNBTTag(player);

        api.getNBTManager().setNBTTag(player, nbtTagCompound.merge(api.getNBTManager().fromString(stringBuilder.toString())));
        return false;
    }
}
