package com.gaziev.patterns.factory.abstract_factory;

import com.gaziev.patterns.factory.abstract_factory.cars.Audi;
import com.gaziev.patterns.factory.abstract_factory.cars.BMW;
import com.gaziev.patterns.factory.abstract_factory.cars.Lada;

public class CarFactory {

    public Car getInstance(String typeCar) {
        if(typeCar.equals("Audi")) { return new Audi(); }
        if(typeCar.equals("BMW")) { return new BMW(); }
        if(typeCar.equals("Lada")) { return new Lada(); }
        return null;
    }
}
