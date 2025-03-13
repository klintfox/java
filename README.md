# Java Features

Key features of Java 8,11,17,21 version.

## JAVA 8

### Lambda Expressions 

### Streams API

### Optional

### Date and Time API (java.time)

### Default Methods

---

## JAVA 11

---

## JAVA 17

---

### Pattern Matching for instanceof

### Sealed Classes
In Java, **Sealed Classes** allow you to define a class or interface with a restricted set of subclasses. This enables more control over class hierarchies, making the code more predictable, safer, and easier to maintain.

Sealed classes are particularly useful when you want to model a limited number of subtypes, such as in cases like state machines, command patterns, or representing a restricted set of types in your system.

Sealed classes were introduced in **Java 17**, and they allow you to specify which classes can extend or implement a class, making it possible to enforce specific constraints on inheritance.

- Key Concepts

- Sealed Class
A `sealed` class is a class that restricts which other classes can subclass it. This is done by specifying a list of permitted subclasses using the `permits` keyword.

- Permitted Subclasses
Only the classes explicitly listed in the `permits` clause can extend or implement the sealed class.

- `non-sealed` Keyword
A subclass of a sealed class can itself be declared as `non-sealed`, allowing it to be subclassed freely.

- `final` Keyword
A subclass of a sealed class can also be marked as `final`, which means it cannot have any subclasses.

- Java Sealed Classes Syntax

The basic syntax for declaring a sealed class is as follows:

```java
public sealed class Vehicle permits Car, Bike, Truck {
    // Class body
}
```
#### Example

[Sealed Class Example](https://github.com/klintfox/java/tree/main/api-vehicle-sealed-class)

### Strong Encapsulation of JDK Internals

### JEP 356: Enhanced Pseudo-Random Number Generators

### Deprecation of the Applet API


## JAVA 21

### Record Types Enhancements

### Pattern Matching for Switch
Pattern Matching for Switch, introduced in Java 17 as a preview feature and finalized in Java 21, enhances the switch statement to allow more powerful and flexible type checks and conversions. Here are some of the key features:

1. Simplified Type Checking
Pattern matching allows the switch statement to match patterns directly on the case values, reducing the need for explicit type casting or multiple instanceof checks. This makes the code cleaner and easier to read.

2. Type Guards
Pattern matching allows for more expressive case labels. You can check types and extract values in a single step, making the code more concise.

java
Copiar
switch (vehicle) {
    case Car c -> System.out.println("This is a car with " + c.getBrand());
    case Bike b -> System.out.println("This is a bike with a sidecar: " + b.hasSidecar());
    default -> System.out.println("Unknown vehicle type");
}
3. Improved Readability and Maintainability
By allowing the switch statement to directly match types and extract their properties, code that involves complex instanceof checks becomes more readable and maintainable. This reduces boilerplate code and makes it easier to modify logic in the future.

4. Integration with Sealed Classes
Pattern Matching for Switch works seamlessly with sealed classes. You can use the switch statement to handle sealed class hierarchies, ensuring that all possible cases are covered at compile time. This helps catch errors early if you forget to account for a specific subclass.

5. Enhancement over Traditional switch Statements
Unlike traditional switch statements that only compare against constants or enums, Pattern Matching allows for more complex checks, such as matching types and extracting values in a single case block.

6. Finalized in Java 21
Pattern Matching for Switch was finalized in Java 21, making it a stable feature and part of the Java language specification, with enhancements for more comprehensive matching capabilities.

For further reading and examples, you can refer to the official Java Documentation. [documentation](https://docs.oracle.com/en/java/javase/21/language/pattern-matching-switch.html#GUID-E69EEA63-E204-41B4-AA7F-D58B26A3B232)

#### Example
[Pattern Matching for Switch Example](https://github.com/klintfox/java/tree/main/vehiclePatternMatching)

### Project Loom (Virtual Threads)

### Foreign Function & Memory API

### Foreign Linker API

