package Chapter1.Strategy.ducks.impl;

import Chapter1.Strategy.behaviour.fly.impl.SimpleFlyBehaviour;
import Chapter1.Strategy.behaviour.quack.impl.SimpleQuackBehaviour;
import Chapter1.Strategy.ducks.Duck;

public class SimpleDuck extends Duck {
    public SimpleDuck() {
        super(new SimpleFlyBehaviour(), new SimpleQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Simple Duck display✅✅✅");
    }
}
