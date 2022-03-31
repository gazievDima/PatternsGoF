package com.gaziev.patterns.behavioral.state.state;

public class PreparationDrink implements State {

    @Override
    public void doWork(String name) {
        System.out.println(name + ": Приготовление напитка..");
    }
}
