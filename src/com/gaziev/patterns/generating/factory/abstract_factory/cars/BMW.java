package com.gaziev.patterns.generating.factory.abstract_factory.cars;

import com.gaziev.patterns.generating.factory.abstract_factory.Car;

public class BMW implements Car {
    @Override
    public String getModel() {
        return "X5";
    }
}
