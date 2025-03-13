package com.klinux.model;

public final class Car implements Vehicle {
	private final String brand;
	private final int numberOfDoors;

	public Car(String brand, int numberOfDoors) {
		this.brand = brand;
		this.numberOfDoors = numberOfDoors;
	}

	public String getBrand() {
		return brand;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}
}
