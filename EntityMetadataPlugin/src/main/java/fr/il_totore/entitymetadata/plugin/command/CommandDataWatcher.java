package fr.il_totore.entitymetadata.plugin.command;

import fr.il_totore.entitymetadata.api.EntityMetadataAPI;
import fr.il_totore.entitymetadata.api.datawatcher.DataWatcher;
import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherKey;
import fr.il_totore.entitymetadata.api.datawatcher.DataWatcherRegistry;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CommandDataWatcher implements CommandExecutor {

    @Override
    @SuppressWarnings("unchecked")
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        DataWatcherRegistry registry = EntityMetadataAPI.getAPI().getDataWatcherRegistry();

        int index = Integer.parseInt(args[1]);
        try {
            for(Entity entity : player.getWorld().getEntitiesByClass((Class<? extends Entity>) Class.forName("org.bukkit.entity." + args[3]))) {
                DataWatcher dataWatcher = EntityMetadataAPI.getAPI().getDataWatcherManager().getDataWatcher(entity);
                switch(args[0].toLowerCase()) {
                    case "boolean":
                        dataWatcher.set(registry.getSerializer(new DataWatcherKey(boolean.class)).index(index), Boolean.parseBoolean(args[2]));
                        player.sendMessage(dataWatcher.get(registry.getSerializer(new DataWatcherKey(boolean.class)).index(index)) + "");
                        break;

                    case "int":
                    case "integer":
                        dataWatcher.set(registry.getSerializer(new DataWatcherKey(int.class)).index(index), Integer.parseInt(args[2]));
                        player.sendMessage(dataWatcher.get(registry.getSerializer(new DataWatcherKey(int.class)).index(index)) + "");
                        break;

                    case "byte":
                        dataWatcher.set(registry.getSerializer(new DataWatcherKey(byte.class)).index(index), Byte.parseByte(args[2]));
                        player.sendMessage(dataWatcher.get(registry.getSerializer(new DataWatcherKey(byte.class)).index(index)) + "");
                        break;

                    case "float":
                        dataWatcher.set(registry.getSerializer(new DataWatcherKey(float.class)).index(index), Float.parseFloat(args[2]));
                        player.sendMessage(dataWatcher.get(registry.getSerializer(new DataWatcherKey(float.class)).index(index)) + "");
                        break;

                    case "short":
                        dataWatcher.set(registry.getSerializer(new DataWatcherKey(short.class)).index(index), Short.parseShort(args[2]));
                        player.sendMessage(dataWatcher.get(registry.getSerializer(new DataWatcherKey(short.class)).index(index)) + "");
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}