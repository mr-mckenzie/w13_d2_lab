package com.SamMike.Dealership;

import com.SamMike.Behaviours.IBuy;
import com.SamMike.Customer.Customer;
import com.SamMike.Vehicles.Car;
import com.SamMike.Vehicles.Doors;
import com.SamMike.Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

    ArrayList<Vehicle> stock;

    int till;

    public Dealership(int cashInjection) {
        this.stock = new ArrayList<>();
        this.till = cashInjection;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addToStock(Vehicle newVehicle) {
        stock.add(newVehicle);
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void buy(Vehicle newVehicle) {
        this.addToStock(newVehicle);
        this.setTill(this.getTill() - newVehicle.getPrice());
    }

    public void addToTill(int purchaseAmount) {
        setTill( this.getTill() + purchaseAmount);
    }

    public void sell(Vehicle vehicle, Customer customer) {
        this.stock.remove(vehicle);
        this.addToTill(vehicle.getPrice());
        customer.buy(vehicle);
    }
}
