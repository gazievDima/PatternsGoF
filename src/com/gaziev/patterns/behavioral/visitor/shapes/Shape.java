package com.gaziev.patterns.behavioral.visitor.shapes;

import com.gaziev.patterns.behavioral.visitor.Visitor;

public interface Shape {
    String getColor();
    String getName();
    void draw();
    void action(Visitor v);
}
