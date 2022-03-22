package com.gaziev.patterns.factory.abstract_factory.cars;

import com.gaziev.patterns.factory.abstract_factory.Car;

public class BMW implements Car {
    @Override
    public String getModel() {
        return "X5";
    }
}