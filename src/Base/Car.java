package Base;

/**
 * Created by dylan on 1/19/17.
 */
public abstract class Car {

    protected String _description;

    public String description() {
        return _description;
    }
    public abstract double cost();

}
