package com.afs.tdd;

public class turnLeft implements Command {
    Application marsRover;

    public turnLeft(Application marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnLeft();
    }
}
