package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad squad = new Squad("Avengers",5,"Infinity Stone");
        assertTrue(squad instanceof Squad);
    }
}