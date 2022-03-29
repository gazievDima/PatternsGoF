package com.gaziev.patterns.behavioral.command.devs;

import com.gaziev.patterns.behavioral.command.Command;

public interface Developer {
    String getName();
    String getPosition();
    void startWork(Command command);
    void writeCode(Command command);
    void endWork(Command command);
}
