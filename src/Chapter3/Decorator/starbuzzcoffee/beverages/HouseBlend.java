package Chapter3.Decorator.starbuzzcoffee.beverages;

import Chapter3.Decorator.starbuzzcoffee.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return size.ordinal() + .89;
    }
}
