package Chapter1_ZnayomstvoZPatternamu.behaviour.quack.impl;

import Chapter1_ZnayomstvoZPatternamu.behaviour.quack.QuackBehaviour;

public class NoQuackBehaviour implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No Quack❌❌❌!!!");
    }
}
