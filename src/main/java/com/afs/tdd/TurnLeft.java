package com.afs.tdd;

public class TurnLeft implements Command {


    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnLeft();
    }
}
