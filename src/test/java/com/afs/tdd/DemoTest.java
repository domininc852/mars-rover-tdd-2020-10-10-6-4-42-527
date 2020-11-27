package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_1_when_command_is_M_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_when_command_is_M_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "M";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_when_command_is_M_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "M";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_when_command_is_M_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "M";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_command_is_R_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "R";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_command_is_R_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "R";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_command_is_R_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "R";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_command_is_R_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "R";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_command_is_L_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "L";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_command_is_L_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String command = "L";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_command_is_L_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String command = "L";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_command_is_L_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String command = "L";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_minus_1_1_N_when_command_is_M_L_M_R_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "MLMR";
        Instructions instructions = new Instructions(marsRover);
        //when
        instructions.receiveInstructions(command);
        instructions.executeInstructions();
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
