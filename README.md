# Assignment 2 — Factory Method & Abstract Factory

## Overview

This Java project demonstrates two creational design patterns:

1. Factory Method
2. Abstract Factory

## Part A — Factory Method

The Factory Method example models a logistics system:

- `Transport` is the product interface.
- `Truck` and `Ship` are concrete products.
- `Logistics` is the abstract creator and declares `createTransport()`.
- `RoadLogistics` and `SeaLogistics` are concrete creators.

`RoadLogistics` creates a `Truck`, while `SeaLogistics` creates a `Ship` through the Factory Method.

## Part B — Abstract Factory

The Abstract Factory example creates related GUI components:

- `GUIFactory` is the abstract factory.
- `Button` and `Checkbox` are abstract product interfaces.
- `WindowsFactory` creates `WindowsButton` and `WindowsCheckbox`.
- `MacFactory` creates `MacButton` and `MacCheckbox`.
- `Client` uses `GUIFactory`, `Button`, and `Checkbox` without directly instantiating concrete products.

Each concrete factory creates a consistent family of GUI components for its platform.

## Project Structure

```text
src/
└── main/
    └── java/
        └── assignment2/
            ├── Main.java
            ├── abstractfactory/
            │   ├── Button.java
            │   ├── Checkbox.java
            │   ├── Client.java
            │   ├── GUIFactory.java
            │   ├── MacButton.java
            │   ├── MacCheckbox.java
            │   ├── MacFactory.java
            │   ├── WindowsButton.java
            │   ├── WindowsCheckbox.java
            │   └── WindowsFactory.java
            └── factorymethod/
                ├── Logistics.java
                ├── RoadLogistics.java
                ├── SeaLogistics.java
                ├── Ship.java
                ├── Transport.java
                └── Truck.java
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure the project SDK as JDK 17.
3. Open `src/main/java/assignment2/Main.java`.
4. Run the `Main` class.

## Expected Output

```text
Factory Method
Truck delivers cargo by road.
Ship delivers cargo by sea.

Abstract Factory
Rendering a Windows button.
Rendering a Windows checkbox.
Rendering a Mac button.
Rendering a Mac checkbox.
```
