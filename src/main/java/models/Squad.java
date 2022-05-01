package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private int squadSize;
    private String cause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    public Squad(String squadName, int squadSize, String cause ){
        this.squadName = squadName;
        this.squadSize = squadSize;
        this.cause = cause;
        instances.add(this);
    }

    public static Squad createNewSquad() {
        return new Squad("Teen Titans",5,"Crime fighting");
    } public String getSquadName() {
        return this.squadName;
    }

    public int getSquadSize() {
        return this.squadSize;
    }

    public String getCause() {
        return this.cause;
    }
    public static ArrayList<Squad> getInstances(){return instances;}
}
