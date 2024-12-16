package Chapter1.Strategy.behaviour.quack.impl;

import Chapter1.Strategy.behaviour.quack.QuackBehaviour;

public class NoQuackBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Quack❌❌❌!!!");
    }
}
