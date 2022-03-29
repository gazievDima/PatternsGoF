package com.gaziev.patterns.behavioral.command;

import com.gaziev.patterns.behavioral.command.devs.Developer;

public class EndWorkCommand implements Command {

    @Override
    public void execute(Developer user) {
        System.out.println(user.getName() + ", " + user.getPosition() + ": " + "end work.");
    }
}
