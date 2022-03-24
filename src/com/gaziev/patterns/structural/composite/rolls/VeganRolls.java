package com.gaziev.patterns.structural.composite.rolls;

import com.gaziev.patterns.structural.composite.Costable;

public class VeganRolls implements Costable {
    private final float cost = 185.37f;

    @Override
    public float getCost() {
        return cost;
    }
}
