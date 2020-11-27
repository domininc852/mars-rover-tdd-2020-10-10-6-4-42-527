package com.afs.tdd;

public class MoveForward implements Command {

    @Override
    public void execute(Application marsRover) {
        marsRover.moveForward();
    }
}
