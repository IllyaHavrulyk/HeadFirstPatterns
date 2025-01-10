package Chapter3.Decorator.starbuzzcoffee.additions;

import Chapter3.Decorator.starbuzzcoffee.Beverage;
import Chapter3.Decorator.starbuzzcoffee.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
