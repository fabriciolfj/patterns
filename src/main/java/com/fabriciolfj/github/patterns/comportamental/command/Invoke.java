package com.fabriciolfj.github.patterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

public class Invoke {

    private List<Command> commands = new ArrayList<>();
    private int current;

    public void compute(final Command command) {
        command.execute();
        commands.add(command);
        current++;
    }

    public void undo(int levels) {
        for(int i = 0; i < levels; i++) {

            if (current > 0) {
                Command remove = commands.remove(--current);
                remove.roolback();
            }
        }
    }
}
