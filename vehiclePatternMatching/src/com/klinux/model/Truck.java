package com.klinux.model;

public final class Truck implements Vehicle {
    private final String brand;
    private final double loadCapacity;

    public Truck(String brand, double loadCapacity) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}