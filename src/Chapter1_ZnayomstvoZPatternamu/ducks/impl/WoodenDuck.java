package Chapter1_ZnayomstvoZPatternamu.ducks.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.fly.impl.NoFlyBehaviour;
import Chapter1_ZnayomstvoZPatternamu.behaviour.quack.impl.NoQuackBehaviour;
import Chapter1_ZnayomstvoZPatternamu.ducks.Duck;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFlyBehaviour(), new NoQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Wooden Duck Display🪵🪵🪵");
    }
}
