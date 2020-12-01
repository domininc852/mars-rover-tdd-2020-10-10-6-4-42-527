package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private static final String MOVE_FORWARD_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private List<Command> instructions = new ArrayList<>();
    private MarsRover marsRover;


    public Controller(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void receiveInstructions(String commands) {
        Arrays.asList(commands.split("")).
                forEach(command -> {
                    if (command.equals(MOVE_FORWARD_COMMAND)) {
                        instructions.add(new MoveForward());
                    } else if (command.equals(TURN_LEFT_COMMAND)) {
                        instructions.add(new turnLeft());
                    } else {
                        instructions.add(new turnRight());
                    }
                });
    }

    public void executeInstructions() {
        instructions.forEach(instruction -> instruction.execute(marsRover));
        instructions.clear();
    }
}
