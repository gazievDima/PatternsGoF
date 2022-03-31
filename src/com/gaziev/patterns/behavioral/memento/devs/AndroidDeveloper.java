package com.gaziev.patterns.behavioral.memento.devs;

public class AndroidDeveloper implements Developer {

    @Override
    public String writeCode(float version) {
        System.out.println("Android Developer write code..");
        return "version: " + version + ".";
    }
}
