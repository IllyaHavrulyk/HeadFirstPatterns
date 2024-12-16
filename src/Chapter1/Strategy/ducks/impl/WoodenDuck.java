package Chapter1.Strategy.ducks.impl;

import Chapter1.Strategy.behaviour.fly.impl.NoFlyBehaviour;
import Chapter1.Strategy.behaviour.quack.impl.NoQuackBehaviour;
import Chapter1.Strategy.ducks.Duck;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFlyBehaviour(), new NoQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Wooden Duck Display🪵🪵🪵");
    }
}
