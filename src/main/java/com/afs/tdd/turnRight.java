package com.afs.tdd;

public class turnRight implements Command {
    Application marsRover;

    public turnRight(Application marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnRight();
    }
}
