package fr.il_totore.entitymetadata.util;

import org.bukkit.Server;

public class ServerVersion implements Comparable<ServerVersion> {

    private String nmsVersion;

    public ServerVersion(String nmsVersion){
        this.nmsVersion = nmsVersion;
    }

    public String getNMSVersion(){
        return nmsVersion;
    }

    @Override
    public int compareTo(ServerVersion o){
        return doubleValue().compareTo(o.doubleValue());
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof ServerVersion)) return false;
        return ((ServerVersion) obj).doubleValue().equals(doubleValue());
    }

    @Override
    public int hashCode(){
        return doubleValue().hashCode();
    }

    public Double doubleValue(){
        return Double.parseDouble(nmsVersion.replaceFirst("_", ".").replace("_R", "").substring(1));
    }

    public static ServerVersion fromServer(Server server){
        return new ServerVersion(server.getClass().getPackage().getName().split("\\.")[3]);
    }

    public static final ServerVersion v1_8 = new ServerVersion("v1_8_R1");
    public static final ServerVersion v1_8_3 = new ServerVersion("v1_8_R2");
    public static final ServerVersion v1_8_4 = new ServerVersion("v1_8_R3");
    public static final ServerVersion v1_8_5 = new ServerVersion("v1_8_R3");
    public static final ServerVersion v1_8_6 = new ServerVersion("v1_8_R3");
    public static final ServerVersion v1_8_7 = new ServerVersion("v1_8_R3");
    public static final ServerVersion v1_8_8 = new ServerVersion("v1_8_R3");
    public static final ServerVersion v1_8_9 = new ServerVersion("v1_8_R3");

    public static final ServerVersion v1_9 = new ServerVersion("v1_9_R1");
    public static final ServerVersion v1_9_1 = new ServerVersion("v1_9_R1");
    public static final ServerVersion v1_9_2 = new ServerVersion("v1_9_R1");
    public static final ServerVersion v1_9_4 = new ServerVersion("v1_9_R2");

    public static final ServerVersion v1_10 = new ServerVersion("v1_10_R1");
    public static final ServerVersion v1_10_1 = new ServerVersion("v1_10_R1");
    public static final ServerVersion v1_10_2 = new ServerVersion("v1_10_R1");

    public static final ServerVersion v1_11 = new ServerVersion("v1_11_R1");
    public static final ServerVersion v1_11_1 = new ServerVersion("v1_11_R1");
    public static final ServerVersion v1_11_2 = new ServerVersion("v1_11_R1");

    public static final ServerVersion v1_12 = new ServerVersion("v1_12_R1");
    public static final ServerVersion v1_12_1 = new ServerVersion("v1_12_R1");
    public static final ServerVersion v1_12_2 = new ServerVersion("v1_12_R1");

    public static final ServerVersion v1_13 = new ServerVersion("v1_13_R1");
    public static final ServerVersion v1_13_1 = new ServerVersion("v1_13_R2");
    public static final ServerVersion v1_13_2 = new ServerVersion("v1_13_R2");

    public static final ServerVersion v1_14 = new ServerVersion("v1_14_R1");
    public static final ServerVersion v1_14_1 = new ServerVersion("v1_14_R1");
    public static final ServerVersion v1_14_2 = new ServerVersion("v1_14_R1");
    public static final ServerVersion v1_14_3 = new ServerVersion("v1_14_R1");
    public static final ServerVersion v1_14_4 = new ServerVersion("v1_14_R1");
}
