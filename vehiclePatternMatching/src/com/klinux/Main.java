package com.klinux;

import com.klinux.model.Bike;
import com.klinux.model.Car;
import com.klinux.model.Truck;
import com.klinux.model.Vehicle;
import com.klinux.service.VehicleInfo;

public class Main {

	 public static void main(String[] args) {
	        // Create different vehicle objects
	        Vehicle car = new Car("Toyota", 4);
	        Vehicle bike = new Bike("Harley Davidson", true);
	        Vehicle truck = new Truck("Volvo", 10.5);

	        // Print information about each vehicle
	        VehicleInfo.printVehicleInfo(car);
	        VehicleInfo.printVehicleInfo(bike);
	        VehicleInfo.printVehicleInfo(truck);
	    }

}
