package com.gaziev.patterns.behavioral.visitor;

import com.gaziev.patterns.behavioral.visitor.shapes.Shape;

public interface Visitor {
    void rotation(Shape shape);
}
