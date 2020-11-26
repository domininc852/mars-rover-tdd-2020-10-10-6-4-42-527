package com.afs.tdd;

public class MoveForward implements Command {
    Application marsRover;

    public MoveForward(Application marsRover) {
        this.marsRover = marsRover;
    }

    public void execute() {
        marsRover.moveForward();
    }
}
