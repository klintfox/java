# java
Key features of Java 8,11,17,21

## JAVA 8

## JAVA 11

## JAVA 17

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

[Sealed Class Example](https://github.com/klintfox/java/tree/main/api-vehicle-sealed-class)

## JAVA 21

