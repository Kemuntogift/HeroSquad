package models;

import org.junit.After;
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

    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.createNewHero();
        assertEquals("laser pointers",newHero.getWeakness());
    }
    @After
    public void tearDown() {
        Hero.clearAllHeroes(); //clear out all the heroes before each test.
    }

    @Test
    public void newHero_getAllInstances_true() {
        Hero newHero = Hero.createNewHero();
        Hero otherHero = Hero.createNewHero();
        assertTrue(Hero.getAllInstances().contains(newHero));
        assertTrue(Hero.getAllInstances().contains(otherHero));
    }

    @Test
    public void getId_heroesInstantiateWithAnId_1() throws Exception{
        Hero.clearAllHeroes();
        Hero newHero = Hero.createNewHero();
        Hero otherHero = Hero.createNewHero();
        assertEquals(2,otherHero.getId());
    }
}