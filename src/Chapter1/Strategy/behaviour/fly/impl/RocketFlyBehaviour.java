package Chapter1.Strategy.behaviour.fly.impl;

import Chapter1.Strategy.behaviour.fly.FlyBehaviour;

public class RocketFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Rocket flying🚀🚀🚀!!!");
    }
}
