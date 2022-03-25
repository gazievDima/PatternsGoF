package com.gaziev.patterns.behavioral;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidEmpty;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidUser;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidWords;
import com.gaziev.patterns.behavioral.observer.People;
import com.gaziev.patterns.behavioral.observer.WeatherStation;

public class Behavioral extends Patterns {

    public static void show() {
        printTitle("BEHAVIORAL");
        exampleObserver();
        exampleChain();
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

    private static void exampleChain() {
        println("//use chain pattern.");

        CheckAuthorization validEmpty = new ValidEmpty();
        CheckAuthorization validUser = new ValidUser();
        CheckAuthorization validWords = new ValidWords();

        validEmpty.setNextCheck(validWords);
        validWords.setNextCheck(validUser);
        validEmpty.check("dima", "12345");
        println("");
    }

}
