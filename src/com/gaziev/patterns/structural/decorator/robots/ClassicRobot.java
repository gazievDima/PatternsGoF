package com.gaziev.patterns.structural.decorator.robots;

import com.gaziev.patterns.structural.decorator.Robot;

public class ClassicRobot implements Robot {
    @Override
    public String shoot() {
        return "Rocket shoot. ";
    }
}
