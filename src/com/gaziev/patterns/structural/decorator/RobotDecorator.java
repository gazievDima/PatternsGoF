package com.gaziev.patterns.structural.decorator;

public class RobotDecorator implements Robot {
    Robot robot;

    public RobotDecorator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String shoot() {
        return robot.shoot();
    }
}
