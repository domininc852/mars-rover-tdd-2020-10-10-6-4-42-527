package com.afs.tdd;

public class LocationInformation {
    private int locationX;
    private int locationY;
    private String direction;
    private final String WEST = "W";
    private final String EAST = "E";
    private final String SOUTH = "S";
    private final String NORTH = "N";

    public LocationInformation(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    public void moveForward() {
        switch (direction) {
            case NORTH:
                locationY += 1;
                break;
            case SOUTH:
                locationY -= 1;
                break;
            case EAST:
                locationX += 1;
                break;
            case WEST:
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

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        LocationInformation other=(LocationInformation)obj;
        return this.locationX==other.locationX&&this.locationY==other.locationY&&this.direction.equals(other.direction);
    }
}
