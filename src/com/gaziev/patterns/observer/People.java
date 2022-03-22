package com.gaziev.patterns.observer;

public class People implements Observer {
    private final String name;
    private final int age;
    private String temperature;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
