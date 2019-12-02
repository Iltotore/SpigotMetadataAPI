package fr.il_totore.task.util;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class PlaceholderTask extends DefaultTask {

    public Map<String, ?> map = new HashMap<>();
    public List<File> files = new ArrayList<>();

    @TaskAction
    public void run(){
        processResources(files);
    }

    private void processResources(List<File> files){
        for(File file : files){
            if(!file.exists()){
                System.out.println("Skipping " + file.getPath() + ": File doesn't exists");
                continue;
            }
            if(file.isDirectory()){
                processResources(Arrays.asList(Objects.requireNonNull(file.listFiles())));
                continue;
            }
            System.out.println("Processing " + file.getPath() + "...");
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                List<String> lines = reader.lines().map(string -> {
                    String finalString = string;
                    for(Map.Entry<String, ?> entry : map.entrySet()) finalString = finalString.replace("${" + entry.getKey() + "}", entry.getValue().toString());
                    return finalString;
                }).collect(Collectors.toList());
                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                for(int i = 0; i < lines.size()-1; i++){
                    writer.write(lines.get(i));
                    writer.newLine();
                }
                writer.write(lines.get(lines.size()-1));
                writer.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
