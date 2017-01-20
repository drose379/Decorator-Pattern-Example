package Decorator;

import Base.Car;
import Base.CarDecorator;

/**
 * Created by dylan on 1/19/17.
 */
public class TurboCharger extends CarDecorator {

    public TurboCharger( Car car ) {
        super( car );
    }

    @Override
    public String description() {
        return _car.description() + " turbo charger";
    }

    @Override
    public double cost() {
        return _car.cost() + 5000;
    }



}
