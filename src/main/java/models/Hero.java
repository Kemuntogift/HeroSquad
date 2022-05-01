package models;

public class Hero {
    private String name;
    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;

    }

    public static Hero createNewHero() {
        return new Hero("Catwoman",27,"Retractable claws","laser pointers");
    }

    public String getName() {
        return this.name;
    }
}
