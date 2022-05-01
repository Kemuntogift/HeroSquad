package models;

public class Hero {
    private String name;
    private int age;
    private String power;
    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;

    }

    public static Hero createNewHero() {
        return new Hero("Catwoman",27,"Retractable claws","laser pointers");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPower() {
        return this.power;
    }
}
