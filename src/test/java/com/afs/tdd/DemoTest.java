package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_1_when_command_is_M_given_0_0_N(){
        //given
        Application marsRover=new Application(0,0,"N");
        String commands ="M";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(1,marsRover.getLocationY());
        assertEquals("N",marsRover.getDirection());
    }
    @Test
    public void should_return_y_minus_1_when_command_is_M_given_0_0_S(){
        //given
        Application marsRover=new Application(0,0,"S");
        String commands ="M";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(-1,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
    @Test
    public void should_return_x_plus_1_when_command_is_M_given_0_0_E(){
        //given
        Application marsRover=new Application(0,0,"E");
        String commands ="M";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }
    @Test
    public void should_return_x_minus_1_when_command_is_M_given_0_0_W(){
        //given
        Application marsRover=new Application(0,0,"W");
        String commands ="M";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(-1,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("W",marsRover.getDirection());
    }
    @Test
    public void should_return_direction_E_when_command_is_R_given_0_0_N(){
        //given
        Application marsRover=new Application(0,0,"N");
        String commands ="R";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("E",marsRover.getDirection());
    }
    @Test
    public void should_return_direction_S_when_command_is_R_given_0_0_E(){
        //given
        Application marsRover=new Application(0,0,"E");
        String commands ="R";
        //when
        marsRover.roverControl(commands);
        //then
        assertEquals(0,marsRover.getLocationX());
        assertEquals(0,marsRover.getLocationY());
        assertEquals("S",marsRover.getDirection());
    }
}
