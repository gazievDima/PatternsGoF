package com.gaziev.patterns.builder;

public class House {
    private final int door;
    private final int wall;
    private final int window;

    House(int door, int wall, int window) {
        this.door = door;
        this.wall = wall;
        this.window = window;
    }

    @Override
    public String toString() {
        return "House{" +
                "door=" + door +
                ", wall=" + wall +
                ", window=" + window +
                '}';
    }

}

