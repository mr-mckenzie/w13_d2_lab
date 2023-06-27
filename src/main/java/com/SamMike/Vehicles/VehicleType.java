package com.SamMike.Vehicles;

public enum VehicleType {
    PETROL ("Petrol"),
    DIESEL ("Diesel"),
    ELECTRIC ("Electric"),
    HYBRID ("Hybrid");

    private final String fuelType;

    VehicleType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
