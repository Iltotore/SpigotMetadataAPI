package fr.il_totore.task;

import fr.il_totore.util.StreamPrinter;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.*;

public class MarkdownToHtml extends DefaultTask {

    public File inputDir = null;
    public File outputDir = null;
    public File scriptDir = new File(getProject().getRootDir(), "scripts/markdown/");
    public File style = new File(getProject().getRootDir(), "markdown/style.css");
    public String titlePattern = "\"# ${title}\"";
    public boolean override = true;

    @TaskAction
    public void run() throws FileNotFoundException {
        if(inputDir == null || outputDir == null)
            throw new IllegalArgumentException("inputDir and outputDir must be defined !");
        if(!inputDir.exists()) inputDir.mkdirs();
        if(!outputDir.exists()) outputDir.mkdirs();
        if(override) {
            for(File file : outputDir.listFiles()) file.delete();
        }
        File convertDirJs = new File(scriptDir, "convertDir.js");
        if(!convertDirJs.exists()) throw new FileNotFoundException(convertDirJs.getAbsolutePath());
        System.out.println("Running " + convertDirJs.getAbsolutePath());
        try {
            String command = "node " + convertDirJs.getAbsolutePath() + " " + inputDir.getAbsolutePath() + " " + outputDir.getAbsolutePath() + " " + style.getAbsolutePath() + " " + titlePattern;
            System.out.println("Running: " + command);
            Process process = Runtime.getRuntime().exec(command);
            StreamPrinter inputPrinter = new StreamPrinter(process.getInputStream(), System.out);
            StreamPrinter errorPrinter = new StreamPrinter(process.getErrorStream(), System.err);
            inputPrinter.start(true);
            errorPrinter.start(true);
            process.waitFor();
            inputPrinter.close();
            errorPrinter.close();
            if(process.exitValue() == 0) {
                System.out.println("Markdown files successfully converted !");
            } else {
                System.out.println("An error occured ! Exit code: " + process.exitValue());
            }
        } catch(IOException | InterruptedException e) {
            e.printStackTrace();
            System.err.println("An error occurred while launching convertDir.js");
        }
    }
}
