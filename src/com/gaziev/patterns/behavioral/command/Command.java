package com.gaziev.patterns.behavioral.command;

import com.gaziev.patterns.behavioral.command.devs.Developer;

public interface Command {
    void execute(Developer user);
}
