package com.SamMike.Customer;

import com.SamMike.Behaviours.IBuy;
import com.SamMike.Vehicles.Vehicle;
import com.SamMike.Vehicles.VehicleType;

import java.util.ArrayList;

public class Customer implements IBuy {

    int purse;
    ArrayList<Vehicle> myCars;

    public Customer(int purse) {
        this.purse = purse;
        this.myCars = new ArrayList<>();
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public ArrayList<Vehicle> getMyCars() {
        return myCars;
    }

    public void addVehicle(Vehicle newVehicle) {
        myCars.add(newVehicle);
    }

    public void buy(Vehicle boughtVehicle) {
        this.addVehicle(boughtVehicle);
        this.setPurse(this.getPurse() - boughtVehicle.getPrice());
    }
}
