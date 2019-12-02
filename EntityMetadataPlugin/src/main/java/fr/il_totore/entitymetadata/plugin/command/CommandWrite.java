package fr.il_totore.entitymetadata.plugin.command;

import fr.il_totore.entitymetadata.api.EntityMetadataAPI;
import fr.il_totore.entitymetadata.api.nbt.NBTManager;
import fr.il_totore.entitymetadata.api.nbt.NBTOutputStream;
import fr.il_totore.entitymetadata.api.nbt.NBTTagCompound;
import fr.il_totore.entitymetadata.api.nbt.NamedNBT;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CommandWrite implements CommandExecutor {

    private File dataFolder;

    public CommandWrite(File dataFolder) {
        this.dataFolder = dataFolder;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        NBTManager nbtManager = EntityMetadataAPI.getAPI().getNBTManager();
        File file = new File(dataFolder, args[0]);
        try {
            if(!file.exists()) file.createNewFile();
            NBTTagCompound nbtTagCompound = nbtManager.fromString(args[1]);
            sender.sendMessage("Writing " + nbtTagCompound.toString());
            NBTOutputStream outputStream = new NBTOutputStream(nbtManager, new GZIPOutputStream(new FileOutputStream(file)));
            outputStream.writeNamedTag(new NamedNBT<>("", nbtTagCompound));
            outputStream.close();
            sender.sendMessage(ChatColor.GREEN + "Finished !");
        } catch(IOException e) {
            e.printStackTrace();
            sender.sendMessage(ChatColor.RED + "Error");
        }
        return false;
    }
}
