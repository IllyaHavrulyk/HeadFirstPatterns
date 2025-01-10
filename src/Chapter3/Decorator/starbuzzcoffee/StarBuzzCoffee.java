package Chapter3.Decorator.starbuzzcoffee;

import Chapter3.Decorator.starbuzzcoffee.additions.Mocha;
import Chapter3.Decorator.starbuzzcoffee.additions.Whip;
import Chapter3.Decorator.starbuzzcoffee.beverages.DarkRoast;
import Chapter3.Decorator.starbuzzcoffee.beverages.Espresso;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        Beverage mocha = new Mocha(darkRoast);
        Beverage whip = new Whip(mocha);
        System.out.println(whip.getDescription() + " $" + whip.cost());
    }

}
