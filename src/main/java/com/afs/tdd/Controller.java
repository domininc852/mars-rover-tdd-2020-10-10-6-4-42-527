package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private static final String MOVE_FORWARD_COMMAND = "M";
    private static final String TURN_LEFT_COMMAND = "L";
    private List<Command> commands = new ArrayList<>();
    private MarsRover marsRover;


    public Controller(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void receiveInstructions(String commands) {
        Arrays.asList(commands.split("")).
                forEach(command -> {
                    if (command.equals(MOVE_FORWARD_COMMAND)) {
                        this.commands.add(new MoveForward());
                    } else if (command.equals(TURN_LEFT_COMMAND)) {
                        this.commands.add(new TurnLeft());
                    } else {
                        this.commands.add(new TurnRight());
                    }
                });
    }

    public void executeCommands() {
        commands.forEach(instruction -> instruction.execute(marsRover));
        commands.clear();
    }
}
