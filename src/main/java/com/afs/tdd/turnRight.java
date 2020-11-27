package com.afs.tdd;

public class turnRight implements Command {


    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnRight();
    }
}
