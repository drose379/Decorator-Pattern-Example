package Makes;

import Base.Car;

/**
 * Created by dylan on 1/19/17.
 */
public class Ford extends Car {

    public Ford() {
        _description = "Makes.Ford with";
    }

    @Override
    public double cost() {
        return 25000;
    }

}
