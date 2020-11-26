package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class Instructions {
    private List<Command> instructions = new ArrayList<>();

    public void addInstruction(Command instruction){
        instructions.add(instruction);
    }
    public void executeInstructions(){
        instructions.forEach(instruction->instruction.execute());
        instructions.clear();
    }
}
