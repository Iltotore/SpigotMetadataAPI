package fr.il_totore.entitymetadata.plugin.command;

import fr.il_totore.entitymetadata.api.EntityMetadataAPI;
import fr.il_totore.entitymetadata.api.nbt.NBTInputStream;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class CommandRead implements CommandExecutor {

    private File dataFolder;

    public CommandRead(File dataFolder) {
        this.dataFolder = dataFolder;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        StringBuilder path = new StringBuilder(args[0]);
        for(int i = 1; i < args.length; i++) path.append(args[i]);
        File file = new File(dataFolder, path.toString());
        sender.sendMessage(ChatColor.YELLOW + "Reading " + file.getName());
        try {
            NBTInputStream inputStream = new NBTInputStream(EntityMetadataAPI.getAPI().getNBTManager(), new GZIPInputStream(new FileInputStream(file)));
            sender.sendMessage(ChatColor.GREEN.toString() + inputStream.readNamedTag());
            inputStream.close();
        } catch(IOException e) {
            e.printStackTrace();
            sender.sendMessage(ChatColor.RED + "Error");
        }
        return false;
    }
}
