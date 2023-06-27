package com.SamMike.Vehicles;

import java.math.BigDecimal;

public abstract class Vehicle {

    Engine engine;
    Tyres tyres;
    Doors doors;

    VehicleType vehicleType;
    String colour;
    int price;

    public Vehicle(Engine engine, Tyres tyres, Doors doors, VehicleType vehicleType, String colour, int price) {
        this.engine = engine;
        this.tyres = tyres;
        this.doors = doors;
        this.vehicleType = vehicleType;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Doors getDoors() {
        return doors;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public String drive() {
        return "Eat my dust!";
    }
}
