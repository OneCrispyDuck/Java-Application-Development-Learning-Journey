# Object Relationships in OOP

## Overview
This module covers fundamental object relationships in Object-Oriented Programming. 
Understanding these relationships is crucial for designing well-structured and maintainable software systems.

## Key Concepts

### 1. Association
- Represents a "has-a" relationship
- Objects are independent of each other
- Example: A Student has a Course

```java
public class Student {
    private Course course; // Association
}
```

### 2. Aggregation
- Special form of association ("weak has-a")
- Child can exist independently of parent
- Example: University has Departments

```java
public class University {
    private List<Department> departments; // Aggregation
}
```

### 3. Composition
- Stronger form of aggregation ("strong has-a")
- Child cannot exist without parent
- Example: Car has Engine

```java
public class Car {
    private final Engine engine; // Composition
}
```

Real-World Analogy:

Association: Person has a Friend
Aggregation: Library has Books
Composition: House has Rooms

## Project Structure
```
src/
└── com/
    └── oop/
        ├── association/
        │   ├── Student.java
        │   └── Course.java
        ├── aggregation/
        │   ├── University.java
        │   └── Department.java
        ├── composition/
        │   ├── Car.java
        │   └── Engine.java
        └── Main.java
```

## Exercises

### Exercise 1: Library System
Implement a simple library system demonstrating:
- Association between Book and Author
- Aggregation between Library and Books
- Composition between Book and Pages

### Exercise 2: School Management
Create a school management system showing:
- Association between Student and Teacher
- Aggregation between School and Classrooms
- Composition between Student and StudentID

## Learning Objectives
- Understand different types of object relationships
- Implement appropriate relationships in Java
- Recognize when to use each type of relationship
- Apply these concepts in real-world scenarios

## Best Practices
1. Use appropriate access modifiers
2. Implement getters/setters as needed
3. Consider object lifecycle management
4. Handle null cases appropriately
5. Follow encapsulation principles

## Testing Your Understanding
- Can you explain the difference between aggregation and composition?
- When would you use association vs. aggregation?
- How does object lifecycle differ in these relationships?

## Resources
- [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [Object-Oriented Design Principles](https://www.oracle.com/java/technologies/oop-concepts.html)
```