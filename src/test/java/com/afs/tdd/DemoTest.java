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
}
