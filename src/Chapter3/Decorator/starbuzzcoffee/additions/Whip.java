package Chapter3.Decorator.starbuzzcoffee.additions;

import Chapter3.Decorator.starbuzzcoffee.Beverage;
import Chapter3.Decorator.starbuzzcoffee.CondimentDecorator;

public class Whip  extends CondimentDecorator {
    private Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
