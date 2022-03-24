package com.gaziev.patterns.structural.composite;

import com.gaziev.patterns.structural.composite.rolls.HotRoll;

import java.util.ArrayList;
import java.util.List;

public class SetRolls implements Costable {
    private final List<Costable> rollsList = new ArrayList<Costable>();

    public void addRoll(Costable roll) {
        rollsList.add(roll);
    }

    @Override
    public float getCost() {
        if (rollsList.isEmpty()) {
            return 0f;
        } else {
            float price = 0f;
            for (Costable costable : rollsList) {
                price += costable.getCost();
            }
            return price;
        }
    }
}
