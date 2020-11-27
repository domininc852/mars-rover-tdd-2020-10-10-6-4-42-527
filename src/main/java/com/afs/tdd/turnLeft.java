package com.afs.tdd;

public class turnLeft implements Command {


    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnLeft();
    }
}
