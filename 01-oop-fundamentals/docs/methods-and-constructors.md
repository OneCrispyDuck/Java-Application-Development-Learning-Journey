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

### Other types of Methods
#### Operational Methods (Business Logic)
```java
public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
    
    public double calculateDiscount(double percentage) {
        return price * (percentage / 100);
    }
```
```java
    #### UTILITY METHODS (Override Object class methods)
    @Override
    public String toString() {
        return "Book{title='" + title + "', price=" + price + "}";
    }
    
    @Override
    public boolean equals(Object obj) {
        // comparison logic
        return false;
    }
```

## Extended learning notes
### General Method types outside the scope of this lecture
Here are all the main types of methods in Java:

1. **Predefined Methods (Built-in)**
```java
public class PredefinedExample {
    public static void main(String[] args) {
        // Math methods
        Math.sqrt(25);
        Math.random();
        
        // String methods
        "hello".length();
        "hello".toUpperCase();
        
        // System methods
        System.out.println();
        System.currentTimeMillis();
    }
}
```

2. **User-defined Methods**
```java
public class UserDefinedTypes {
    // Instance Method
    public void instanceMethod() {
        // Requires object creation to call
    }

    // Static Method
    public static void staticMethod() {
        // Can be called without object creation
    }

    // Abstract Method (in abstract class)
    abstract void abstractMethod();

    // Final Method (cannot be overridden)
    final void finalMethod() {
    }

    // Synchronized Method (thread-safe)
    synchronized void synchronizedMethod() {
    }

    // Native Method (implemented in another language)
    native void nativeMethod();
}
```

3. **Method Types Based on Parameters**
```java
public class ParameterTypes {
    // No-Parameter Method
    void noParams() {
    }

    // Parameterized Method
    void withParams(int x, String y) {
    }

    // Variable Arguments Method
    void varArgs(String... strings) {
    }
}
```

4. **Method Types Based on Return**
```java
public class ReturnTypes {
    // Void Method (no return)
    void voidMethod() {
    }

    // Return Method
    int returnMethod() {
        return 42;
    }

    // Generic Return Method
    <T> T genericMethod(T item) {
        return item;
    }
}
```

5. **Access Modifier Methods**
```java
public class AccessTypes {
    // Public Method
    public void publicMethod() {
    }

    // Private Method
    private void privateMethod() {
    }

    // Protected Method
    protected void protectedMethod() {
    }

    // Default/Package-Private Method
    void defaultMethod() {
    }
}
```

6. **Factory Methods**
```java
public class FactoryExample {
    // Factory Method
    public static FactoryExample createInstance() {
        return new FactoryExample();
    }
}
```

7. **Accessor and Mutator Methods**
```java
public class AccessorMutator {
    private String value;

    // Getter (Accessor)
    public String getValue() {
        return value;
    }

    // Setter (Mutator)
    public void setValue(String value) {
        this.value = value;
    }
}
```

8. **Overridden Methods**
```java
public class OverrideExample {
    // Overridden methods from Object class
    @Override
    public String toString() {
        return "Custom toString";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
```

9. **Interface Methods**
```java
interface InterfaceTypes {
    // Abstract Method (pre-Java 8)
    void abstractMethod();

    // Default Method (Java 8+)
    default void defaultMethod() {
    }

    // Static Method (Java 8+)
    static void staticMethod() {
    }

    // Private Method (Java 9+)
    private void privateMethod() {
    }
}
```

10. **Recursive Methods**
```java
public class RecursiveExample {
    // Recursive Method
    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
```

These different types of methods serve various purposes:
- Code organization
- Functionality encapsulation
- Access control
- Thread safety
- Performance optimization
- Object-oriented design patterns
- API design
- Code reusability

