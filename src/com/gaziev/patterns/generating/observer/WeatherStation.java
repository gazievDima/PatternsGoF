package com.gaziev.patterns.generating.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation {
    private final List<Observer> peopleList = new LinkedList<>();
    private String weather;

    public WeatherStation(String weather) {
        this.weather = weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        updateWeather(weather);
    }

    public void observe(Observer el) {
        peopleList.add(el);
        updateWeather(weather);
    }

    public void updateWeather(String temperature) {
        for(Observer el : peopleList) {
            el.setTemperature(temperature);
        }
    }
}
