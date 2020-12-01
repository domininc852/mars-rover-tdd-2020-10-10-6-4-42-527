package com.afs.tdd;

public class LocationInformation {
    private int locationX;
    private int locationY;
    private Direction direction;

    public LocationInformation(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = Direction.WEST;
                break;
            case EAST:
                direction = Direction.NORTH;
                break;
            case SOUTH:
                direction = Direction.EAST;
                break;
            case WEST:
                direction = Direction.SOUTH;
                break;
        }
    }

    void turnRight() {
        switch (direction) {
            case NORTH:
                direction = Direction.EAST;
                break;
            case EAST:
                direction = Direction.SOUTH;
                break;
            case SOUTH:
                direction = Direction.WEST;
                break;
            case WEST:
                direction = Direction.NORTH;
                break;
        }
    }

    void moveForward() {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        LocationInformation other = (LocationInformation) obj;
        return this.locationX == other.locationX && this.locationY == other.locationY && this.direction.equals(other.direction);
    }
}
