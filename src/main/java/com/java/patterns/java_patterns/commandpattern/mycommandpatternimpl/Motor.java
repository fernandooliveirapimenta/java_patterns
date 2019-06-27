package com.java.patterns.java_patterns.commandpattern.mycommandpatternimpl;

import java.util.ArrayList;
import java.util.List;

public class Motor {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void init() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
