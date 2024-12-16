package Chapter1.Strategy.ducks.impl;

import Chapter1.Strategy.behaviour.fly.impl.NoFlyBehaviour;
import Chapter1.Strategy.behaviour.quack.impl.SimpleQuackBehaviour;
import Chapter1.Strategy.ducks.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new NoFlyBehaviour(), new SimpleQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("ModelDuck Display💅💅💅");
    }
}
