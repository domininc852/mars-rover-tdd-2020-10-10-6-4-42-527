package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_1_when_command_is_M_given_0_0_N() {
        //given
        Application marsRover = new Application(0, 0, "N");
        MoveForward moveForwardInstruction = new MoveForward(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(moveForwardInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_minus_1_when_command_is_M_given_0_0_S() {
        //given
        Application marsRover = new Application(0, 0, "S");
        MoveForward moveForwardInstruction = new MoveForward(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(moveForwardInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x_plus_1_when_command_is_M_given_0_0_E() {
        //given
        Application marsRover = new Application(0, 0, "E");
        MoveForward moveForwardInstruction = new MoveForward(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(moveForwardInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x_minus_1_when_command_is_M_given_0_0_W() {
        //given
        Application marsRover = new Application(0, 0, "W");
        MoveForward moveForwardInstruction = new MoveForward(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(moveForwardInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_command_is_R_given_0_0_N() {
        //given
        Application marsRover = new Application(0, 0, "N");
        turnRight turnRightInstruction = new turnRight(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnRightInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_command_is_R_given_0_0_E() {
        //given
        Application marsRover = new Application(0, 0, "E");
        turnRight turnRightInstruction = new turnRight(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnRightInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_command_is_R_given_0_0_S() {
        //given
        Application marsRover = new Application(0, 0, "S");
        turnRight turnRightInstruction = new turnRight(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnRightInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_command_is_R_given_0_0_W() {
        //given
        Application marsRover = new Application(0, 0, "W");
        turnRight turnRightInstruction = new turnRight(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnRightInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_W_when_command_is_L_given_0_0_N() {
        //given
        Application marsRover = new Application(0, 0, "N");
        turnLeft turnLeftInstruction = new turnLeft(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnLeftInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_S_when_command_is_L_given_0_0_W() {
        //given
        Application marsRover = new Application(0, 0, "W");
        turnLeft turnLeftInstruction = new turnLeft(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnLeftInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_E_when_command_is_L_given_0_0_S() {
        //given
        Application marsRover = new Application(0, 0, "S");
        turnLeft turnLeftInstruction = new turnLeft(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnLeftInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_direction_N_when_command_is_L_given_0_0_E() {
        //given
        Application marsRover = new Application(0, 0, "E");
        turnLeft turnLeftInstruction = new turnLeft(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(turnLeftInstruction);
        instructions.executeInstructions();
        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_minus_1_1_N_when_command_is_M_L_M_R_given_0_0_N() {
        //given
        Application marsRover = new Application(0, 0, "N");
        MoveForward moveForwardInstruction = new MoveForward(marsRover);
        turnLeft turnLeftInstruction = new turnLeft(marsRover);
        turnRight turnRightIntsruction = new turnRight(marsRover);
        Instructions instructions = new Instructions();
        //when
        instructions.addInstruction(moveForwardInstruction);
        instructions.addInstruction(turnLeftInstruction);
        instructions.addInstruction(moveForwardInstruction);
        instructions.addInstruction(turnRightIntsruction);
        instructions.executeInstructions();
        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
