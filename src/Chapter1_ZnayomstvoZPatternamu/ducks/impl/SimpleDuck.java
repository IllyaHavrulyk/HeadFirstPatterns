package Chapter1_ZnayomstvoZPatternamu.ducks.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.fly.impl.SimpleFlyBehaviour;
import Chapter1_ZnayomstvoZPatternamu.behaviour.quack.impl.SimpleQuackBehaviour;
import Chapter1_ZnayomstvoZPatternamu.ducks.Duck;

public class SimpleDuck extends Duck {
    public SimpleDuck() {
        super(new SimpleFlyBehaviour(), new SimpleQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("Simple Duck display✅✅✅");
    }
}
