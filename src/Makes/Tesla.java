package Makes;

import Base.Car;

/**
 * Created by dylan on 1/19/17.
 */
public class Tesla extends Car {

    public Tesla() {
        _description = "Makes.Tesla with";
    }

    @Override
    public double cost() {
        return 85000;
    }

}
