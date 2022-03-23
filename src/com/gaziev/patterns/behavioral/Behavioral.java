package com.gaziev.patterns.behavioral;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.behavioral.observer.People;
import com.gaziev.patterns.behavioral.observer.WeatherStation;

public class Behavioral extends Patterns {

    public static void show() {
        printTitle("BEHAVIORAL");
        exampleObserver();
    }

    private static void exampleObserver() {
        println("//use observer pattern.");

        WeatherStation station = new WeatherStation("+23");
        People man = new People("Dima", 28);
        println("man temperature: " + man.getTemperature());

        station.observe(man);
        println("man temperature: " + man.getTemperature());
        station.setWeather("-13");
        println("man temperature: " + man.getTemperature());
        println("");
    }

}
