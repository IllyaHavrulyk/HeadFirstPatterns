package Chapter1_ZnayomstvoZPatternamu.ducks.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.fly.impl.RocketFlyBehaviour;
import Chapter1_ZnayomstvoZPatternamu.behaviour.quack.impl.RocketQuackBehaviour;
import Chapter1_ZnayomstvoZPatternamu.ducks.Duck;

public class RocketDuck extends Duck {
    public RocketDuck() {
        super(new RocketFlyBehaviour(), new RocketQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Rocket Duck Display🚀🚀🚀");
    }
}
