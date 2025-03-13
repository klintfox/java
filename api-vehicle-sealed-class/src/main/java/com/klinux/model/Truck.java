package com.klinux.model;

public final class Truck extends Vehicle {
    
    private double loadCapacity;

    public Truck(String brand, double loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("It has a load capacity of " + loadCapacity + " tons.");
    }
}