package com.gaziev.patterns.factory.factory_method;

public class PizzaFactory {
    
    public Pizza getMeatPizza() {
        return new MeatPizza();
    }

    public Pizza getVeganPizza() {
        return new VeganPizza();
    }

    public Pizza getSpicyPizza() {
        return new SpicyPizza();
    }

    public Pizza getChickenPizza() {
        return new ChickenPizza();
    }

    private  class ChickenPizza implements Pizza {
        @Override
        public String getTaste() {
            return "pizza Chicken!";
        }
    }

    private  class SpicyPizza implements Pizza {
        @Override
        public String getTaste() {
            return "pizza Spicy!";
        }
    }

    private  class VeganPizza implements Pizza {
        @Override
        public String getTaste() {
            return "pizza Vegan!";
        }
    }

    private  class MeatPizza implements Pizza {
        @Override
        public String getTaste() {
            return "pizza Meat!";
        }
    }
}
