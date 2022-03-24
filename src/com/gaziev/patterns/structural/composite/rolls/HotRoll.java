package com.gaziev.patterns.structural.composite.rolls;

import com.gaziev.patterns.structural.composite.Costable;

public class HotRoll implements Costable {
    private final float cost = 289.15f;

    @Override
    public float getCost() {
        return cost;
    }
}
