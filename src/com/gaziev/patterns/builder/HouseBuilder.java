package com.gaziev.patterns.builder;

public class HouseBuilder {
    private static int door = 1;
    private int wall = 4;
    private int window = 2;

    public HouseBuilder makeDoor(int door) {
        HouseBuilder.door = door;
        return this;
    }

    public HouseBuilder makeWall(int wall) {
        this.wall = wall;
        return this;
    }

    public HouseBuilder makeWindow(int window) {
        this.window = window;
        return this;
    }

    public House build() {
        return new House(
                door,
                wall,
                window
        );
    }
}