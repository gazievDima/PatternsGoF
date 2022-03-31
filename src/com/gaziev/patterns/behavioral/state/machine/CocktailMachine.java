package com.gaziev.patterns.behavioral.state.machine;

import com.gaziev.patterns.behavioral.state.state.ChooseDrink;
import com.gaziev.patterns.behavioral.state.state.GiveDrink;
import com.gaziev.patterns.behavioral.state.state.PreparationDrink;
import com.gaziev.patterns.behavioral.state.state.State;

public class CocktailMachine implements Machine{
    private final String name;
    State state;

    public CocktailMachine(String name, State state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public void changeState() {
        if (state instanceof ChooseDrink) {
            state = new PreparationDrink();
        } else if (state instanceof PreparationDrink) {
            state = new GiveDrink();
        } else if (state instanceof GiveDrink) {
            state = new ChooseDrink();
        }
    }

    @Override
    public void doWork() {
        state.doWork(name);
    }
}
