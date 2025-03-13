package com.klinux.service;

import org.springframework.stereotype.Service;

import com.klinux.model.Bike;
import com.klinux.model.Car;
import com.klinux.model.Truck;
import com.klinux.model.Vehicle;

@Service
public class VehicleService {

    public Vehicle getVehicleDetails(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car("Toyota", 4);
            case "bike":
                return new Bike("Harley Davidson", true);
            case "truck":
                return new Truck("Volvo", 10.5);
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
