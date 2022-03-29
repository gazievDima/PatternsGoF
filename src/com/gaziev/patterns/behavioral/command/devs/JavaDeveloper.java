package com.gaziev.patterns.behavioral.command.devs;

import com.gaziev.patterns.behavioral.command.Command;

public class JavaDeveloper implements Developer {
    private final String name;
    private final String position;


    public JavaDeveloper(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void startWork(Command command) {
        command.execute(this);
    }

    @Override
    public void writeCode(Command command) {
        command.execute(this);
    }

    @Override
    public void endWork(Command command) {
        command.execute(this);
    }
}
