package com.gaziev.patterns.behavioral.strategy.devs;

public class WebDev implements Developer, Html{
    String name;

    public WebDev(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void writeHTMLCode() {
        System.out.println("Web dev: " + name + " is writing HTML code..");
    }

}
