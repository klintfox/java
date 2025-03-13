package com.klinux.service;

import com.klinux.model.Bike;
import com.klinux.model.Car;
import com.klinux.model.Truck;
import com.klinux.model.Vehicle;

public class VehicleInfo {

    // Method to handle different vehicle types using pattern matching in a switch
    public static void printVehicleInfo(Vehicle vehicle) {
        switch (vehicle) {
            case Car c -> System.out.println("This is a car from " + c.getBrand() + " with " + c.getNumberOfDoors() + " doors.");
            case Bike b -> System.out.println("This is a bike from " + b.getBrand() + " with a sidecar: " + b.hasSidecar());
            case Truck t -> System.out.println("This is a truck from " + t.getBrand() + " with a load capacity of " + t.getLoadCapacity() + " tons.");
            default -> System.out.println("Unknown vehicle type.");
        }
    }
}