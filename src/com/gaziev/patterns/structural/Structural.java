package com.gaziev.patterns.structural;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.structural.adapter.ConverterAdapter;
import com.gaziev.patterns.structural.adapter.NetworkSource;
import com.gaziev.patterns.structural.adapter.Projector;
import com.gaziev.patterns.structural.bridge.RemoteController;
import com.gaziev.patterns.structural.bridge.devices.MP3Player;
import com.gaziev.patterns.structural.bridge.devices.TV;
import com.gaziev.patterns.structural.composite.SetRolls;
import com.gaziev.patterns.structural.composite.rolls.HotRoll;
import com.gaziev.patterns.structural.composite.rolls.PhiladelphiaRoll;
import com.gaziev.patterns.structural.composite.rolls.VeganRolls;
import com.gaziev.patterns.structural.decorator.Robot;
import com.gaziev.patterns.structural.decorator.robots.ClassicRobot;
import com.gaziev.patterns.structural.decorator.robots.HardRobot;
import com.gaziev.patterns.structural.decorator.robots.LightRobot;
import com.gaziev.patterns.structural.facade.Services;
import com.gaziev.patterns.structural.flyweight.Developer;
import com.gaziev.patterns.structural.flyweight.DeveloperFactory;
import com.gaziev.patterns.structural.flyweight.Project;
import com.gaziev.patterns.structural.proxy.LocalStorage;
import com.gaziev.patterns.structural.proxy.ProxyStorage;
import com.gaziev.patterns.structural.proxy.RemoteStorage;

import java.util.ArrayList;
import java.util.List;

public class Structural extends Patterns {

    public static void show() {
        printTitle("STRUCTURAL");
        exampleAdapter();
        exampleBridge();
        exampleComposite();
        exampleDecorator();
        exampleFacade();
        exampleFlyweight();
        exampleProxy();
    }

    private static void exampleAdapter() {
        println("//use adapter pattern.");

        String content = NetworkSource.getContent();
        println(Projector.showContent(content)); //show error content type
        println(Projector.showContent(ConverterAdapter.convert(content))); //successful use of data
        println("");
    }

    private static void exampleBridge() {
        println("//use bridge pattern.");

        RemoteController controllerTV = new RemoteController(new TV());
        println(controllerTV.onDevice());
        println(controllerTV.changeChannel());
        println(controllerTV.offDevice());

        RemoteController controllerMP3 = new RemoteController(new MP3Player());
        println(controllerMP3.onDevice());
        println(controllerMP3.changeChannel());
        println(controllerMP3.offDevice());
        println("");
    }

    private static void exampleComposite() {
        println("//use composite pattern.");

        HotRoll hotRoll = new HotRoll();
        PhiladelphiaRoll philadelphiaRoll = new PhiladelphiaRoll();
        VeganRolls veganRolls = new VeganRolls();

        SetRolls setRollsVegan = new SetRolls();
        setRollsVegan.addRoll(veganRolls);
        setRollsVegan.addRoll(veganRolls);
        setRollsVegan.addRoll(veganRolls);

        SetRolls setRollsAssorted = new SetRolls();
        setRollsAssorted.addRoll(hotRoll);
        setRollsAssorted.addRoll(philadelphiaRoll);
        setRollsAssorted.addRoll(veganRolls);

        println("hot roll price: " + hotRoll.getCost());
        println("vegan roll price: " + veganRolls.getCost());
        println("philadelphia roll price: " + philadelphiaRoll.getCost());
        println("set vegan rolls price: " + setRollsVegan.getCost());
        println("set assorted rolls price: " + setRollsAssorted.getCost());
        println("");
    }

    private static void exampleDecorator() {
        println("//use decorator pattern.");

        Robot robotClassic = new ClassicRobot();
        Robot robotLight = new LightRobot(robotClassic);
        Robot robotHard = new HardRobot(robotClassic);

        println("robot classic: " + robotClassic.shoot());
        println("robot light: " + robotLight.shoot());
        println("robot hard: " + robotHard.shoot());

        Robot robotBig = new HardRobot(new LightRobot(new ClassicRobot()));
        println("robot big: " + robotBig.shoot());
        println("");
    }

    private static void exampleFacade() {
        println("//use facade pattern.");

        println("create job services.");

        Services services = new Services();
        String result = services.start();

        println("result job services: " + result);
        println("");
    }

    private static void exampleFlyweight() {
        println("//use flyweight pattern.");

        List<Developer> developers = new ArrayList<Developer>();
        DeveloperFactory developerFactory = new DeveloperFactory();

        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));
        developers.add(developerFactory.getDeveloper("java"));

        developers.add(developerFactory.getDeveloper("go"));
        developers.add(developerFactory.getDeveloper("go"));

        developers.add(developerFactory.getDeveloper("python"));
        developers.add(developerFactory.getDeveloper("python"));
        developers.add(developerFactory.getDeveloper("python"));

        Project project = new Project(developers);
        project.startProject();
        println("");
    }

    private static void exampleProxy() {
        println("//use proxy pattern.");

        println("request data from remote storage by ProxyStorage...");

        ProxyStorage proxyStorage = new ProxyStorage(
                new LocalStorage(),
                new RemoteStorage()
        );
        println(proxyStorage.getData());
        println("");
    }
}

















