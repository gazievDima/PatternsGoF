package com.gaziev.patterns.behavioral.visitor;

import com.gaziev.patterns.behavioral.visitor.shapes.Shape;

public class Rotate implements Visitor {

    @Override
    public void rotation(Shape shape) {
        System.out.println("Shape " + shape.getName() + " color: " + shape.getColor() + " is rotation..");
    }
}
