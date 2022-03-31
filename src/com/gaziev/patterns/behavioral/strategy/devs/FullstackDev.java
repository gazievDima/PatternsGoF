package com.gaziev.patterns.behavioral.strategy.devs;

public class FullstackDev implements Developer, Html, Java{
    String name;

    public FullstackDev(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void writeHTMLCode() {
        System.out.println("Fullstack dev: " + name + " is writing HTML code..");
    }

    @Override
    public void writeJavaCode() {
        System.out.println("Fullstack dev: " + name + " is writing JAVA code..");
    }
}
