package Chapter1.Strategy.behaviour.quack.impl;

import Chapter1.Strategy.behaviour.quack.QuackBehaviour;

public class SimpleQuackBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Simple Quack✅✅✅!!!");
    }
}
