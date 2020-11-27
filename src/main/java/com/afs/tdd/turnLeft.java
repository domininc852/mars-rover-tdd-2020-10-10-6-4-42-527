package com.afs.tdd;

public class turnLeft implements Command {


    @Override
    public void execute(Application marsRover) {
        marsRover.turnLeft();
    }
}
