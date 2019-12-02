package fr.il_totore.task.spigot;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SpigotClearPluginsTask extends DefaultTask {

    public File pluginDir;
    public List<String> whitelist = new ArrayList<>();
    public boolean clearConfig = false;

    @TaskAction
    public void run(){
        assert pluginDir == null : "pluginDir cannot be null !";
        if(!pluginDir.exists()) pluginDir.mkdirs();
        if(!pluginDir.isDirectory()) throw new IllegalArgumentException("Invalid directory: " + pluginDir);
        List<File> files = Arrays.asList(Objects.requireNonNull(pluginDir.listFiles())).stream()
                .filter(file -> !file.isDirectory() && !whitelist.contains(file.getName()))
                .collect(Collectors.toList());

        files.forEach(File::delete);
    }
}
