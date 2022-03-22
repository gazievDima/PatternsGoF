package com.gaziev.patterns;

import com.gaziev.patterns.builder.House;
import com.gaziev.patterns.builder.HouseBuilder;
import com.gaziev.patterns.factory.abstract_factory.Car;
import com.gaziev.patterns.factory.abstract_factory.CarFactory;
import com.gaziev.patterns.factory.factory_method.Pizza;
import com.gaziev.patterns.factory.factory_method.PizzaFactory;
import com.gaziev.patterns.observer.People;
import com.gaziev.patterns.observer.WeatherStation;
import com.gaziev.patterns.singleton.NetworkService;

public class Main {

    public static void main(String[] args) {

        println("//use singleton pattern.");
        exampleSingleton();

        println("//use observer pattern.");
        exampleObserver();

        println("//use builder pattern.");
        exampleBuilder();

        println("//use factory method pattern.");
        exampleFactoryMethod();

        println("//use abstract factory pattern.");
        exampleAbstractFactory();

    }

    public static void exampleSingleton() {
        NetworkService serviceONE = NetworkService.getInstance();
        serviceONE.saveCache("mail.ru");

        NetworkService serviceTWO = NetworkService.getInstance();
        println(serviceTWO.getCache());
        println("");
    }

    public static void exampleObserver() {
        WeatherStation station = new WeatherStation("+23");
        People man = new People("Dima", 28);
        println("man temperature: " + man.getTemperature());

        station.observe(man);
        println("man temperature: " + man.getTemperature());
        station.setWeather("-13");
        println("man temperature: " + man.getTemperature());
        println("");
    }

    public static void exampleBuilder() {
        HouseBuilder builder = new HouseBuilder();
        House house = builder.build();
        println(house.toString());

        House house2 = builder.makeDoor(2).makeWall(4).makeWindow(4).build();
        println(house2.toString());
        println("");
    }

    public static void exampleFactoryMethod() {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.getChickenPizza();
        Pizza pizza2 = pizzaFactory.getMeatPizza();
        Pizza pizza3 = pizzaFactory.getSpicyPizza();
        Pizza pizza4 = pizzaFactory.getVeganPizza();

        println("this is " + pizza1.getTaste());
        println("this is " + pizza2.getTaste());
        println("this is " + pizza3.getTaste());
        println("this is " + pizza4.getTaste());
        println("");
    }

    private static void exampleAbstractFactory() {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getInstance("Audi");
        Car car2 = carFactory.getInstance("BMW");
        Car car3 = carFactory.getInstance("Lada");

        println("car1: " + car1.getModel());
        println("car2: " + car2.getModel());
        println("car3: " + car3.getModel());
        println("");
    }

    private static void println(String str) {
        System.out.println(str);
    }

}