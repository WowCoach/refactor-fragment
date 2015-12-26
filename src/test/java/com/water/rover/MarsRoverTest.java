package com.water.rover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        rover = new MarsRover(1, 1, "N");
    }

    @Test
    public void shouldMoveRoverAround() throws Exception {
        assertEquals("1 3 N", rover.run("MM"));
    }

    @Test
    public void shouldTurnRoverRight() throws Exception {
        assertEquals("1 1 W", rover.run("RRR"));
    }

    @Test
    public void shouldTurnRoverLeft() throws Exception {
        assertEquals("1 1 E", rover.run("LLL"));
    }

    @Test
    public void shouldCircleAround() throws Exception {
        assertEquals("1 1 N", rover.run("MRMRMRMR"));
        assertEquals("1 1 N", rover.run("MLMLMLML"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAllowInvalidInput() throws Exception {
        rover.run("invalid input");
    }
}
