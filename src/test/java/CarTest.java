import com.SamMike.Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;
    VehicleType vehicleType;


    @Before
    public void before() {
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors(5);
        vehicleType = VehicleType.HYBRID;
        car = new Car(engine, tyres, doors, vehicleType, "Red", 20000, "Speedster 7");
    }

    @Test
    public void canDrive() {
        assertEquals("Eat my dust!", car.drive());
    }

    @Test
    public void canGetVehicleType() {
        assertEquals("Hybrid", car.getVehicleType().getFuelType());
    }

    @Test
    public void canSetColour() {
        car.setColour("Baby blue");
        assertEquals("Baby blue", car.getColour());
    }
}
