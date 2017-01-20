import Base.Car;
import Decorator.LeatherInterior;
import Decorator.ManualGearBox;
import Decorator.MoonRoof;
import Decorator.TurboCharger;
import Makes.Ford;
import Makes.Tesla;

/**
 * Created by dylan on 1/19/17.
 */
public class Main {

    public static void main( String[] args ) {

        Car carOne = new Ford();
        carOne = new LeatherInterior( carOne );
        carOne = new ManualGearBox( carOne );

        System.out.println( carOne.description() + " Total cost: $" + carOne.cost() );

        Car carTwo = new Tesla();
        carTwo = new LeatherInterior( carTwo );
        carTwo = new MoonRoof( carTwo );
        carTwo = new TurboCharger( carTwo );

        System.out.println( carTwo.description() + " Total cost: $" + carTwo.cost() );

    }

}
