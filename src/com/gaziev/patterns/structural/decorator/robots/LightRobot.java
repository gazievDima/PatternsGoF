package com.gaziev.patterns.structural.decorator.robots;

import com.gaziev.patterns.structural.decorator.Robot;
import com.gaziev.patterns.structural.decorator.RobotDecorator;

public class LightRobot extends RobotDecorator {
    public LightRobot(Robot robot) {
        super(robot);
    }

    @Override
    public String shoot() {
        return super.shoot() + "Fly away. ";
    }
}
