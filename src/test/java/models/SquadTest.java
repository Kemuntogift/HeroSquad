package models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad squad = new Squad("Teen Titans",5,"Crime fighting");
        assertTrue(squad instanceof Squad);
    }

    @Test
    public void newSquad_methodInstantiatesCorrectly_true() {
        Squad newSquad = Squad.createNewSquad();
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void newSquad_getName_String() {
        Squad newSquad = Squad.createNewSquad();
        assertEquals("Teen Titans",newSquad.getSquadName());
    }

    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.createNewSquad();
        assertEquals(5,newSquad.getSquadSize());
    }

    @Test
    public void newSquad_getCause_String() {
        Squad newSquad = Squad.createNewSquad();
        assertEquals("Crime fighting",newSquad.getCause());
    }

    @Test
    public void newSquad_getAllInstances_true() {
        Squad newSquad = Squad.createNewSquad();
        Squad otherSquad = Squad.createNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(otherSquad));
    }

    @AfterAll
    public void tearDown() {
        Squad.clearAllSquadMembers(); //clear out all the squad members before each test.
    }
}