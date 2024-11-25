# Java Inheritance Basics

## Overview
Inheritance is a fundamental Object-Oriented Programming concept that allows a class to inherit attributes and methods from another class. In Java, we use the `extends` keyword to implement inheritance.

## Key Concepts

### 1. Parent (Base) and Child (Derived) Classes
- **Parent Class**: The class whose properties are inherited
- **Child Class**: The class that inherits properties from parent class

```java
// Parent class
class Animal {
    String name;
    
    public void eat() {
        System.out.println("I can eat.");
    }
}

// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark.");
    }
}
```
### 2. Types of Inheritance
    1. Single Inheritance
        - A class inherits from one parent class
        - Example: class Dog extends Animal

    2. Multilevel Inheritance
        - Chain of inheritance
        - Example: class GermanShepherd extends Dog (Dog extends Animal)

    3. Hierarchical Inheritance
        - Multiple classes inherit from one parent class
        - Example: Both Dog and Cat extend Animal
### 3. super Keyword
- Used to refer to parent class members
- Used to invoke parent class constructor

```java
class Dog extends Animal {
    String breed;
    
    public Dog(String name, String breed) {
        super(name);  // Call parent constructor
        this.breed = breed;
    }
}
```

### 4. Important Points
    - Java doesn't support multiple inheritance through classes
    - All classes in Java inherit from Object class
    - Private members of parent class are not inherited
    - Constructors are not inherited

#### Best Practices
    - Use inheritance only when there is a true "IS-A" relationship
    - Keep the inheritance hierarchy simple and shallow
    - Override toString() method when needed
    - Use composition over inheritance when possible

    