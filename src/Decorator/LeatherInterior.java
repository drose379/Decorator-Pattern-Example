package Decorator;

import Base.Car;
import Base.CarDecorator;

/**
 * Created by dylan on 1/19/17.
 */
public class LeatherInterior extends CarDecorator {

    public LeatherInterior( Car car ) {
        super( car );
    }

    @Override
    public String description() {
        return _car.description() + " leather interior";
    }

    @Override
    public double cost() {
        return _car.cost() +  3000;
    }

}
