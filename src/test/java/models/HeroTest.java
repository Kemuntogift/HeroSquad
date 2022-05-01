package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    //create new instance
    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero testHero = new Hero("Catwoman",27,"Retractable claws","laser pointers");
        assertTrue(testHero instanceof Hero);
    }
//use method to create new instance
    @Test
    public void newHero_methodInstantiatesCorrectly_true() {
        Hero newHero = Hero.createNewHero();
        assertTrue(newHero instanceof Hero);
    }

    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.createNewHero();
        assertEquals("Catwoman",newHero.getName());
    }

    @Test
    public void newHero_getAge_Integer() {
        Hero newHero = Hero.createNewHero();
        assertEquals(27,newHero.getAge());
    }

    @Test
    public void newHero_getPowers_String() {
        Hero newHero = Hero.createNewHero();
        assertEquals("Retractable claws",newHero.getPower());
    }
}