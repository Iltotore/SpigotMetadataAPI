package fr.il_totore.task.util;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import com.jcraft.jsch.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FTPUploadTask extends DefaultTask {

    @TaskAction
    public void run(){
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");

        String remoteHost = (String) getProject().property("ftp.host");
        String username = (String) getProject().property("ftp.user");
        String password = (String) getProject().property("ftp.password");
        System.out.println("connecting to FTP...");
        JSch jsch = new JSch();
        try{
            Session jschSession = jsch.getSession(username, remoteHost);
            jschSession.setConfig(config);
            System.out.println("logging in...");
            jschSession.setPassword(password);
            jschSession.connect();
            System.out.println("uploading file...");
            ChannelSftp channel = (ChannelSftp) jschSession.openChannel("sftp");
            channel.connect();
            channel.put(new FileInputStream(new File(getProject().getBuildDir(), "libs/RushFFA.jar")), (String) getProject().property("ftp.file"));
        } catch(JSchException | FileNotFoundException | SftpException e){
            e.printStackTrace();
        }
    }
}
