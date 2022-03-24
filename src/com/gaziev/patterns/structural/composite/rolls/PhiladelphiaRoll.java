package com.gaziev.patterns.structural.composite.rolls;

import com.gaziev.patterns.structural.composite.Costable;

public class PhiladelphiaRoll implements Costable {
    private final float cost = 322.56f;

    @Override
    public float getCost() {
        return cost;
    }
}
