package models;

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
}