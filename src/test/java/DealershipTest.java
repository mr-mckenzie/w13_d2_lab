import com.SamMike.Customer.Customer;
import com.SamMike.Dealership.Dealership;
import com.SamMike.Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;
    VehicleType vehicleType;


    @Before
    public void before() {
        dealership = new Dealership(100000);
        engine = new Engine();
        tyres = new Tyres();
        doors = new Doors(5);
        vehicleType = VehicleType.HYBRID;
        car = new Car(engine, tyres, doors, vehicleType, "Red", 20000, "Speedster 7");
    }

    @Test
    public void canAddCar() {
        dealership.addToStock(car);
        assertEquals(true, dealership.getStock().contains(car));
    }

    @Test
    public void canGetTill() {
        assertEquals(100000, dealership.getTill());
    }

    @Test
    public void canSetTill() {
        dealership.setTill(0);
        assertEquals(0, dealership.getTill());
    }

    @Test
    public void canAddToTill() {
        dealership.addToTill(1);
        assertEquals(100001, dealership.getTill());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buy(car);
        assertEquals(80000, dealership.getTill());
        assertEquals(true, dealership.getStock().contains(car));
    }

    @Test
    public void canSellToCustomer() {
        Customer customer = new Customer(500000);
        dealership.sell(car, customer);
        assertEquals(480000, customer.getPurse());
        assertEquals(true, customer.getMyCars().contains(car));
        assertEquals(120000, dealership.getTill());
        assertEquals(false, dealership.getStock().contains(car));
    }
}
