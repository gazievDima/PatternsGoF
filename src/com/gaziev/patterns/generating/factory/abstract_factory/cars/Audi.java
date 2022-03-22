package com.gaziev.patterns.generating.factory.abstract_factory.cars;

import com.gaziev.patterns.generating.factory.abstract_factory.Car;

public class Audi implements Car {
    @Override
    public String getModel() {
        return "A8";
    }
}
