# Vehicle Service Example Project

This is a simple Spring Boot project that demonstrates the use of **Java Sealed Classes** (introduced in Java 17). The project simulates a system for managing different vehicle types (Car, Bike, Truck) with the use of inheritance and polymorphism.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Overview

This project contains a basic implementation of a service that returns vehicle details based on the vehicle type (car, bike, truck). 

The main features of the project include:

- **Vehicle Inheritance**: Three types of vehicles: `Car`, `Bike`, and `Truck`, all extending a common `Vehicle` base class.
- **Spring Boot**: Used to expose an HTTP REST API for interacting with the service.

## Project Structure
```sh
├───main
│   ├───java
│   │   └───com
│   │       └───klinux
│   │           │   ApiVehicleSealedClassApplication.java
│   │           │
│   │           ├───controller
│   │           │       VehicleController.java
│   │           │
│   │           ├───model
│   │           │       Bike.java
│   │           │       Car.java
│   │           │       Truck.java
│   │           │       Vehicle.java
│   │           │
│   │           └───service
│   │                   VehicleService.java
```

### 1. **Model Layer**
- `Vehicle.java`: The base class for all vehicles.
- `Car.java`, `Bike.java`, `Truck.java`: Specific vehicle classes extending the `Vehicle` class.

### 2. **Service Layer**
- `VehicleService.java`: The service that provides vehicle details based on the input `type`.

### 3. **Controller Layer**
- `VehicleController.java`: The controller that exposes the vehicle service through an HTTP endpoint.

### 4. **Configuration**
- `application.properties`: Spring Boot configuration file.

## Technologies Used

- **Spring Boot**: For creating the RESTful service.
- **Java 17+**: To leverage new features like sealed classes and pattern matching in switch statements.
- **Maven**: Dependency management and build tool.

## Getting Started

Follow these instructions to get a copy of the project running on your local machine.

### Prerequisites

- **Java 17+**: Ensure you have Java 17 or higher installed.
- **Maven**: Make sure Maven is installed to build and run the application.
- **Spring Boot**: Spring Boot framework for creating the RESTful API.

### Postman
![Postman](https://github.com/klintfox/java/blob/main/api-vehicle-sealed-class/src/main/resources/images/1.PNG)