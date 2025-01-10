package Chapter3.Decorator.starbuzzcoffee.beverages;

import Chapter3.Decorator.starbuzzcoffee.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return size.ordinal() + 1.0;
    }
}
