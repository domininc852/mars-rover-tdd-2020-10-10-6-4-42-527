package com.afs.tdd;

public class TurnRight implements Command {


    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnRight();
    }
}
