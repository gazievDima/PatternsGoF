package com.gaziev.patterns.behavioral.iterator;

import java.util.Objects;

public class Square {
    String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(this.hashCode() != o.hashCode()) return false;

        Square square = (Square) o;
        return Objects.equals(color, square.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
