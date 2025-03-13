package com.klinux.model;

public sealed class Vehicle permits Car, Bike, Truck {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void displayInfo() {
        System.out.println("This is a " + brand + " vehicle.");
    }
}
