package Chapter1.Strategy.behaviour.fly.impl;

import Chapter1.Strategy.behaviour.fly.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("NO FLY ❌❌❌!!!");
    }
}
