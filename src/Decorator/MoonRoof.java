package Decorator;

import Base.Car;
import Base.CarDecorator;

/**
 * Created by dylan on 1/19/17.
 */
public class MoonRoof extends CarDecorator {

    public MoonRoof( Car c ) {
        super( c );
    }

    @Override
    public String description() {
        return _car.description() + " moonroof";
    }

    @Override
    public double cost() {
        return _car.cost() + 2500;
    }

}
