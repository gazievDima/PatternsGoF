package com.gaziev.patterns.behavioral.visitor.shapes;

import com.gaziev.patterns.behavioral.visitor.Visitor;

public class RoundShape implements Shape{
    private final String color;
    private final String name;

    public RoundShape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        System.out.println("Shape " + color + " Round is drawing...");
    }

    @Override
    public void action(Visitor v) {
        v.rotation(this);
    }
}
