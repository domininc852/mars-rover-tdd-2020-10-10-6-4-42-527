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
        else{
            turnDirection(command);
        }
    }

    private void turnDirection(String command) {
        if (command=="R"){
            switch (direction){
                case "N":direction="E";break;
                case "E":direction="S";break;
                case "S":direction="W";break;
                case "W":direction="N";break;
            }
        }
        else{
            if(direction=="N"){
                direction="W";
            }
            else if (direction=="W"){
                direction="S";
            }
            else if (direction=="S"){
                direction="E";
            }
        }
    }

    private void moveForward() {
        switch(direction){
            case "N":locationY+=1;break;
            case "S":locationY-=1;break;
            case "E":locationX+=1;break;
            case "W":locationX-=1;break;

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
