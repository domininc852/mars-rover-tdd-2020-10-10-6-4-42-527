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

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "S":
                direction = "E";
                break;
            case "W":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                locationY += 1;
                break;
            case "S":
                locationY -= 1;
                break;
            case "E":
                locationX += 1;
                break;
            case "W":
                locationX -= 1;
                break;

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
