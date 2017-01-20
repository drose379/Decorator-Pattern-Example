package Base;

/**
 * Created by dylan on 1/19/17.
 */
public abstract class CarDecorator extends Car {

    protected Car _car;

    public CarDecorator( Car car ) {
        _car = car;
    }

    public abstract String description();

}
