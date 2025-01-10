package Chapter3.Decorator.starbuzzcoffee.beverages;


import Chapter3.Decorator.starbuzzcoffee.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return size.ordinal() * 1.99;
    }
}
