package Chapter1_ZnayomstvoZPatternamu.behaviour.fly.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.fly.FlyBehaviour;

public class NoFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("NO FLY ❌❌❌!!!");
    }
}
