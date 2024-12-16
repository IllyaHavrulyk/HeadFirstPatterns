package Chapter1.Strategy.behaviour.fly.impl;

import Chapter1.Strategy.behaviour.fly.FlyBehaviour;

public class SimpleFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Simple FLY✅✅✅!!!");
    }
}
