package Decorator;

import Base.Car;
import Base.CarDecorator;

/**
 * Created by dylan on 1/19/17.
 */
public class ManualGearBox extends CarDecorator {

    public ManualGearBox( Car c ) {
        super( c );
    }

    @Override
    public String description() {
        return _car.description() + " manual gear box";
    }

    @Override
    public double cost() {
        return _car.cost() + 500;
    }

}
