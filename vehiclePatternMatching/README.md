# Vehicle Pattern Matching Example
This project demonstrates the usage of Pattern Matching for Switch in Java, introduced as a preview feature in Java 17 and finalized in Java 21. The project includes a simple system for handling different types of vehicles using a sealed interface and pattern matching in the switch statement.

## Explanation:

- **Java 17:** Introduced pattern matching for switch as a preview feature, allowing case labels with patterns rather than just constants. 
- **Java 21:** Finalized pattern matching for switch, making it a permanent feature and enhancing its capabilities.

## Project Overview
The application defines a Vehicle interface with multiple implementations: Car, Bike, and Truck. We use Pattern Matching in a switch statement to handle the different Vehicle types and print specific details about them.

## Features:
Pattern Matching: Uses Pattern Matching for Switch (JEP 432) to simplify type checking and casting when working with instances of Vehicle.

## Project Structure
The project is organized into the following structure:

```sh
src/
├── com/
│   └── example/
│       ├── model/
│       │   ├── Vehicle.java      // Sealed interface
│       │   ├── Car.java          // Concrete class: Car
│       │   ├── Bike.java         // Concrete class: Bike
│       │   └── Truck.java        // Concrete class: Truck
│       ├── service/
│       │   └── VehicleInfo.java  // Class to demonstrate pattern matching
│       └── Main.java             // Main entry point to run the application
```
1. Vehicle.java (Model Package)
This is a sealed interface for the Vehicle type:
```sh
public sealed interface Vehicle permits Car, Bike, Truck {
    String getBrand();
}```
2. Concrete Classes (Car, Bike, Truck)
Each of these classes implements the Vehicle interface and is final, which means they cannot be extended.

Car.java:
```java
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
```
Bike.java:
```java
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
```
Truck.java:
```java
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
```
3. VehicleInfo.java (Service Package)
This class demonstrates Pattern Matching for Switch in a switch statement to handle different Vehicle types:
```java
public class VehicleInfo {
    public static void printVehicleInfo(Vehicle vehicle) {
        switch (vehicle) {
            case Car c -> System.out.println("This is a car from " + c.getBrand() + " with " + c.getNumberOfDoors() + " doors.");
            case Bike b -> System.out.println("This is a bike from " + b.getBrand() + " with a sidecar: " + b.hasSidecar());
            case Truck t -> System.out.println("This is a truck from " + t.getBrand() + " with a load capacity of " + t.getLoadCapacity() + " tons.");
            default -> System.out.println("Unknown vehicle type.");
        }
    }
}
4. Main.java (Root Package)
The main entry point that demonstrates the creation of different vehicle objects and calls the printVehicleInfo method to display their details:

java
Copiar
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 4);
        Vehicle bike = new Bike("Harley Davidson", true);
        Vehicle truck = new Truck("Volvo", 10.5);

        // Print information about each vehicle
        VehicleInfo.printVehicleInfo(car);
        VehicleInfo.printVehicleInfo(bike);
        VehicleInfo.printVehicleInfo(truck);
    }
}
```
## Output
```
This is a car from Toyota with 4 doors.
This is a bike from Harley Davidson with a sidecar: true
This is a truck from Volvo with a load capacity of 10.5 tons.
```

Prerequisites
Java 21 (Pattern Matching for Switch is available from Java 21 onwards)
A Java IDE (e.g., IntelliJ IDEA, Eclipse) or the JDK setup on your machine to run the program.