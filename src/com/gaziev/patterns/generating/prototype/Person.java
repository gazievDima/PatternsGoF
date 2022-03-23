package com.gaziev.patterns.generating.prototype;

public class Person implements Cloned {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} hashCode(): " + hashCode();
    }
}
