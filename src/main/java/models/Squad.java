package models;

import java.util.ArrayList;

public class Squad {
    private String squadName;
    private int squadSize;
    private String cause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private ArrayList<Hero>  squadMembers = new ArrayList<>();
    private int squadId;
    public Squad(String squadName, int squadSize, String cause ){
        this.squadName = squadName;
        this.squadSize = squadSize;
        this.cause = cause;
        instances.add(this);
        this.squadMembers = new ArrayList<>();
        this.squadId = instances.size();
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
    public static void clearAllSquadMembers(){
        instances.clear();
    }
    public void createSquadMembers(Hero newMember) {
        squadMembers.add(newMember);
    }
    public ArrayList<Hero> getSquadMembers(){
        return squadMembers;
    }
    public int getSquadId(){return squadId;}
    public static Squad findBySquadId(int id) {return instances.get(id-1);}
}
