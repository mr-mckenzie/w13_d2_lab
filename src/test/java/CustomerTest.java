import com.SamMike.Customer.Customer;
import com.SamMike.Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;
    VehicleType vehicleType;


    @Before
    public void before() {
        customer = new Customer(22000);
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors(5);
        vehicleType = VehicleType.HYBRID;
        car = new Car(engine, tyres, doors, vehicleType, "Red", 20000, "Speedster 7");
    }

    @Test
    public void canAddVehicle() {
        customer.addVehicle(car);
        assertEquals(true, customer.getMyCars().contains(car));
    }

    @Test
    public void canBuyVehicle() {
        customer.buy(car);
        assertEquals(2000, customer.getPurse());
        assertEquals(true, customer.getMyCars().contains(car));
    }


}
