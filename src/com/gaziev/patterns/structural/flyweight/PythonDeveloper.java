package com.gaziev.patterns.structural.flyweight;

public class PythonDeveloper implements Developer {
    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " to write code..");
    }
}
