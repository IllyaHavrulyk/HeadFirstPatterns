package Chapter1.Strategy.ducks;

import Chapter1.Strategy.behaviour.fly.impl.RocketFlyBehaviour;
import Chapter1.Strategy.ducks.impl.ModelDuck;
import Chapter1.Strategy.ducks.impl.RocketDuck;
import Chapter1.Strategy.ducks.impl.SimpleDuck;
import Chapter1.Strategy.ducks.impl.WoodenDuck;

import java.util.List;

public class DuckTest {
    public static void main(String[] args) {
        List.of(new SimpleDuck(), new WoodenDuck(), new RocketDuck())
                .forEach(duck -> {
                    duck.display();
                    duck.swim();
                    duck.performFly();
                    duck.performQuack();
                });

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new RocketFlyBehaviour());
        modelDuck.performFly();
    }
}
