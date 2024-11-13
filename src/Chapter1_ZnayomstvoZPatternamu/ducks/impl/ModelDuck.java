package Chapter1_ZnayomstvoZPatternamu.ducks.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.fly.impl.NoFlyBehaviour;
import Chapter1_ZnayomstvoZPatternamu.behaviour.quack.impl.SimpleQuackBehaviour;
import Chapter1_ZnayomstvoZPatternamu.ducks.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new NoFlyBehaviour(), new SimpleQuackBehaviour());
    }

    @Override
    public void display() {
        System.out.println("ModelDuck Display💅💅💅");
    }
}
