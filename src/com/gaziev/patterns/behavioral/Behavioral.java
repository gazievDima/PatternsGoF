package com.gaziev.patterns.behavioral;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidEmpty;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidUser;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidWords;
import com.gaziev.patterns.behavioral.command.EndWorkCommand;
import com.gaziev.patterns.behavioral.command.StartWorkCommand;
import com.gaziev.patterns.behavioral.command.WriteCodeCommand;
import com.gaziev.patterns.behavioral.command.devs.JavaDeveloper;
import com.gaziev.patterns.behavioral.command.devs.PythonDeveloper;
import com.gaziev.patterns.behavioral.iterator.MyCollection;
import com.gaziev.patterns.behavioral.iterator.Square;
import com.gaziev.patterns.behavioral.observer.People;
import com.gaziev.patterns.behavioral.observer.WeatherStation;

public class Behavioral extends Patterns {

    public static void show() {
        printTitle("BEHAVIORAL");
        exampleObserver();
        exampleChain();
        exampleCommand();
        exampleIterator();
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

    private static void exampleCommand() {
        println("//use command pattern.");

        StartWorkCommand startWorkCommand = new StartWorkCommand();
        WriteCodeCommand writeCodeCommand = new WriteCodeCommand();
        EndWorkCommand endWorkCommand = new EndWorkCommand();

        JavaDeveloper javaDeveloper = new JavaDeveloper("Dima", "Android Developer");
        javaDeveloper.startWork(startWorkCommand);
        javaDeveloper.writeCode(writeCodeCommand);
        javaDeveloper.endWork(endWorkCommand);

        PythonDeveloper pythonDeveloper = new PythonDeveloper("Alexey", "Python Developer");
        pythonDeveloper.startWork(startWorkCommand);
        pythonDeveloper.writeCode(writeCodeCommand);
        pythonDeveloper.endWork(endWorkCommand);
        println("");
    }

    private static void exampleIterator() {
        println("//use iterator pattern.");

        MyCollection myCollection = new MyCollection();
        myCollection.add(new Square("green"));
        myCollection.add(new Square("orange"));
        myCollection.add(new Square("blue"));
        myCollection.add(new Square("red"));

        while(myCollection.hasNext()) {
            System.out.println(myCollection.getNext());
        }

        myCollection.remove(new Square("green"));
        myCollection.remove(new Square("orange"));

        while (myCollection.hasNext()) {
            System.out.println(myCollection.getNext());
        }
        println("");
    }
}
