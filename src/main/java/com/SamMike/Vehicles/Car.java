package com.SamMike.Vehicles;

import java.math.BigDecimal;

public class Car extends Vehicle{

    String model;

    public Car(Engine engine, Tyres tyres, Doors doors, VehicleType vehicleType, String colour, int price, String model) {
        super(engine, tyres, doors, vehicleType, colour, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
