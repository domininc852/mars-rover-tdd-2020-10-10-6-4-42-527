package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class Application {
    private int locationX;
    private int locationY;
    private String direction;

    public Application(int locationX, int locationY, String direction) {

        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public void roverControl(String commands){
        splitInstructions(commands).forEach(this::executeInstructions);
    }

    private List<String> splitInstructions(String commands) {
        return Arrays.asList(commands.split(""));
    }
    private void executeInstructions(String command){
        if (command.equals("M")){
            moveForward();
        }
    }

    private void moveForward() {
        if (direction.equals("N")){
            locationY+=1;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }
}
