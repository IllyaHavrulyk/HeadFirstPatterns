package Chapter1.Strategy.ducks.impl;

import Chapter1.Strategy.behaviour.fly.impl.RocketFlyBehaviour;
import Chapter1.Strategy.behaviour.quack.impl.RocketQuackBehaviour;
import Chapter1.Strategy.ducks.Duck;

public class RocketDuck extends Duck {
    public RocketDuck() {
        super(new RocketFlyBehaviour(), new RocketQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Rocket Duck Display🚀🚀🚀");
    }
}
