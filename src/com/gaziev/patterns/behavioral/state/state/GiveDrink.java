package com.gaziev.patterns.behavioral.state.state;

public class GiveDrink implements State {

    @Override
    public void doWork(String name) {
        System.out.println(name + ": Выдача напитка..");
    }
}
