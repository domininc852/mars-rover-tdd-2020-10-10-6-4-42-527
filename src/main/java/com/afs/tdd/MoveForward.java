package com.afs.tdd;

public class MoveForward implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.moveForward();
    }
}
