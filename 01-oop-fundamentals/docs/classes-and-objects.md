
# Classes and Objects in Java

## Classes
A class is a blueprint for creating objects.

### Class Structure
```java
public class Car {
    // Fields (attributes)
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void startEngine() {
        System.out.println("Engine started!");
    }
}
```
### Class Components
1. Fields
    - Instance variables (object state)
    - Class variabels (Static fields)

```java
public class Student {
    private String name;            // instance variable
    private static int totalCount;  // class variable
}
```
2. Constructors
- Default constructor
```java
public class Book {
    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000000000";
        this.price = 0.0;
        this.numberOfPages = 0;
    }
}
```
- Parameterized constructor 
```java
public class Book {
    private String title;
    
    public Book(String title, String author, String isbn, double price, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }
}
```
- Constructor Overloading
```java
public class Person {
    private String name;
    private int age;

    public Person() {
        this("Unknown", 0);
    }

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

3. Methods
- Instance methods
- Static methods
- Getter and Setter methods

### Object Creation and Usage
```java
Car myCar = new Car("Toyota", "Camry", 2024);
myCar.startEngine();
```

### Best Practices
1. Follow naming conventions
    - Class names: PascalCase
    - Method names: camelCase
    - Field names: camelCase

2. Encapsulation
    - Make fields private
    - Provide public methods for access

3. Single Responsibility Principle
    - Each class should have one primary responsibility