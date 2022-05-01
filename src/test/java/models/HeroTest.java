package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    //create instance of hero
    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Catwoman",27,"Retractable claws","laser pointers");
        assertTrue(testHero instanceof Hero);
    }

    @Test
    public void newHero_methodInstantiatesCorrectly_true() {
        Hero newHero = Hero.createNewHero();
        assertTrue(newHero instanceof Hero);
    }
}