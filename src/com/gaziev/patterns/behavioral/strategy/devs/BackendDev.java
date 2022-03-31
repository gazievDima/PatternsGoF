package com.gaziev.patterns.behavioral.strategy.devs;

public class BackendDev implements Developer, Java {
    String name;

    public BackendDev(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void writeJavaCode() {
        System.out.println("Backend dev: " + name + " is writing JAVA code..");
    }
}
