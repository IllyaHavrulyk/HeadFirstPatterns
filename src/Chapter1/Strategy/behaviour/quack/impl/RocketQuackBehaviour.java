package Chapter1.Strategy.behaviour.quack.impl;

import Chapter1.Strategy.behaviour.quack.QuackBehaviour;

public class RocketQuackBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Rocket Quack🚀🚀🚀!!!");
    }
}
