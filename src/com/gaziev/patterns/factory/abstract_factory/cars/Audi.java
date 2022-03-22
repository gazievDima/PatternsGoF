package com.gaziev.patterns.factory.abstract_factory.cars;

import com.gaziev.patterns.factory.abstract_factory.Car;

public class Audi implements Car {
    @Override
    public String getModel() {
        return "A8";
    }
}
