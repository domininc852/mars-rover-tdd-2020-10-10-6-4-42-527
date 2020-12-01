package com.afs.tdd;

public class MarsRover {
    private LocationInformation locationInformation;


    public MarsRover(LocationInformation locationInformation) {
        this.locationInformation = locationInformation;
    }

    public void moveForward(){
        this.locationInformation.moveForward();
    }

    public void turnRight(){
        this.locationInformation.turnRight();
    }
    public void turnLeft(){
        this.locationInformation.turnLeft();
    }

    public LocationInformation getLocationInformation() {
        return locationInformation;
    }
}
