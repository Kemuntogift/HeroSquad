package models;

public class Hero {
    public Hero(String name, Integer age, String power, String weakness) {

    }

    public static Hero createNewHero() {
        return new Hero("Catwoman",27,"Retractable claws","laser pointers");
    }
}
