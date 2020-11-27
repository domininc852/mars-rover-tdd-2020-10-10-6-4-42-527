package com.afs.tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructions {
    private List<Command> instructions = new ArrayList<>();
    private Application marsRover;

    public Instructions(Application marsRover) {
        this.marsRover = marsRover;
    }

    public void receiveInstructions(String commands) {
        Arrays.asList(commands.split("")).
                forEach(command -> {
                    if (command.equals("M")) {
                        instructions.add(new MoveForward());
                    } else if (command.equals("L")) {
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
