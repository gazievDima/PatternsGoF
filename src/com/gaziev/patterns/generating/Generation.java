package com.gaziev.patterns.generating;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.generating.builder.House;
import com.gaziev.patterns.generating.builder.HouseBuilder;
import com.gaziev.patterns.generating.factory.abstract_factory.Car;
import com.gaziev.patterns.generating.factory.abstract_factory.CarFactory;
import com.gaziev.patterns.generating.factory.factory_method.Pizza;
import com.gaziev.patterns.generating.factory.factory_method.PizzaFactory;
import com.gaziev.patterns.generating.prototype.Person;
import com.gaziev.patterns.generating.singleton.NetworkService;

public class Generation extends Patterns {

    public static void show() {
        printTitle("GENERATION");
        exampleSingleton();
        exampleBuilder();
        exampleFactoryMethod();
        exampleAbstractFactory();
        examplePrototype();
    }

    private static void exampleSingleton() {
        println("//use singleton pattern.");

        NetworkService serviceONE = NetworkService.getInstance();
        serviceONE.saveCache("mail.ru");

        NetworkService serviceTWO = NetworkService.getInstance();
        println(serviceTWO.getCache());
        println("");
    }

    private static void exampleBuilder() {
        println("//use builder pattern.");

        HouseBuilder builder = new HouseBuilder();
        House house = builder.build();
        println(house.toString());

        House house2 = builder.makeDoor(2).makeWall(4).makeWindow(4).build();
        println(house2.toString());
        println("");
    }

    private static void exampleFactoryMethod() {
        println("//use factory method pattern.");

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
        println("//use abstract factory pattern.");

        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getInstance("Audi");
        Car car2 = carFactory.getInstance("BMW");
        Car car3 = carFactory.getInstance("Lada");

        println("car1: " + car1.getModel());
        println("car2: " + car2.getModel());
        println("car3: " + car3.getModel());
        println("");
    }

    private static void examplePrototype() {
        println("//use prototype pattern.");

        Person person1 = new Person("Alice", 25);
        println(person1.toString());
        Person personClone = person1.clone();
        println(personClone.toString());
        println("");
    }

}
