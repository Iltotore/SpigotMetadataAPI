package fr.il_totore.entitymetadata.plugin;

import fr.il_totore.entitymetadata.plugin.command.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("datawatcher").setExecutor(new CommandDataWatcher());
        getCommand("parrot").setExecutor(new CommandParrot());
        getCommand("nbt").setExecutor(new CommandNBT());
        getCommand("read").setExecutor(new CommandRead(getDataFolder().getParentFile().getParentFile()));
        getCommand("write").setExecutor(new CommandWrite(getDataFolder().getParentFile().getParentFile()));
    }
}
