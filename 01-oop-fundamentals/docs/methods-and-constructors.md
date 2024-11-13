# Methods and Constructors in Java

## Methods

### Method Declaration
```java
[access_modifier] [static] return_type methodName(parameters) {
    // method body
}
```

### Types of Methods
1. Instance Methods
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

2. Static Methods
```java
public class MathUtils {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
```
3. Getter and Setter Methods
```java
public class Employee {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
```

### Method Overloading
```java
public class Printer {
    public void print(String text) {
        System.out.println(text);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public void print(String text, int copies) {
        for(int i = 0; i < copies; i++) {
            System.out.println(text);
        }
    }
}
```

### Constuctors
Types of Constructors
1. Default Constructor
```java
public class User {
    // Automatically provided if no constructor is defined
    public User() {
    }
}
```

2. Parameterized Constructor
```java
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```
3. Constructor Chaining
```java
public class Product {
    private String name;
    private double price;
    private String category;

    public Product() {
        this("Unknown");
    }

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this(name, price, "General");
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
```

### Constructor vs Method
```markdown
| Characteristic      | Constructor          | Method                |
|---------------------|----------------------|-----------------------|
| Name                | Same name as class   | Any valid name        |
| Return Type         | No return type       | Has return type       |
| Invocation          | Called automatically | Called explicitly     |
| Inheritance         | Cannot be inherited  | Can be inherited      |
```

## Best Practices
1. Method Design
    - Keep methods focused (single responsibility)
    - Use meaningful names
    - Limit parameters (max 3-4)
    - Consider method overloading for clarity

2. Constructor Design
    - Initialize all fields
    - Use constructor chaining when appropriate
    - Validate parameters
    - Keep complex logic in separate methods

3. General
    - Document with JavaDoc comments
    - Handle exceptions appropriately
    - Follow naming conventions

