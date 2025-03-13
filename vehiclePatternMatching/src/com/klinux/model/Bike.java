package com.klinux.model;

public final class Bike implements Vehicle {
    private final String brand;
    private final boolean hasSidecar;

    public Bike(String brand, boolean hasSidecar) {
        this.brand = brand;
        this.hasSidecar = hasSidecar;
    }

    public String getBrand() {
        return brand;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}