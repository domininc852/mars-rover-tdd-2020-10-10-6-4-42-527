package com.afs.tdd;

public class MarsRover {
    private LocationInformation locationInformation;


    public MarsRover(LocationInformation locationInformation) {
        this.locationInformation = locationInformation;
    }

    void moveForward() {
        this.locationInformation.moveForward();
    }

    void turnRight() {
        this.locationInformation.turnRight();
    }

    void turnLeft() {
        this.locationInformation.turnLeft();
    }

    public LocationInformation getLocationInformation() {
        return locationInformation;
    }
}
