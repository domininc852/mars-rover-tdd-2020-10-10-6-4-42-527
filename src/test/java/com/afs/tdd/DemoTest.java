package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.net.Socket;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    private static final String MOVE_FORWARD_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private static final String TURN_RIGHT_COMMAND = "R";
    private final String WEST = "W";
    private final String EAST = "E";
    private final String SOUTH = "S";
    private final String NORTH = "N";

    @Test
    public void should_return_y_plus_1_when_command_is_M_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,NORTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(MOVE_FORWARD_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,1,NORTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_y_minus_1_when_command_is_M_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0, SOUTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(MOVE_FORWARD_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,-1,SOUTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_x_plus_1_when_command_is_M_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,EAST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(MOVE_FORWARD_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(1,0,EAST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_x_minus_1_when_command_is_M_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,WEST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(MOVE_FORWARD_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(-1,0,WEST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_E_when_command_is_R_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,NORTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_RIGHT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,EAST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_S_when_command_is_R_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,EAST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_RIGHT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,SOUTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_W_when_command_is_R_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,SOUTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_RIGHT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,WEST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_N_when_command_is_R_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,WEST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_RIGHT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,NORTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_W_when_command_is_L_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,NORTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_LEFT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,WEST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_S_when_command_is_L_given_0_0_W() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,WEST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_LEFT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,SOUTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_E_when_command_is_L_given_0_0_S() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,SOUTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_LEFT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,EAST),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_direction_N_when_command_is_L_given_0_0_E() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,EAST));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(TURN_LEFT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(0,0,NORTH),marsRover.getLocationInformation());
    }

    @Test
    public void should_return_minus_1_1_N_when_command_is_M_L_M_R_given_0_0_N() {
        //given
        MarsRover marsRover = new MarsRover(new LocationInformation(0,0,NORTH));
        Controller controller = new Controller(marsRover);
        //when
        controller.receiveInstructions(MOVE_FORWARD_COMMAND+TURN_LEFT_COMMAND+MOVE_FORWARD_COMMAND+TURN_RIGHT_COMMAND);
        controller.executeInstructions();
        //then
        assertEquals(new LocationInformation(-1,1,NORTH),marsRover.getLocationInformation());
    }
}
