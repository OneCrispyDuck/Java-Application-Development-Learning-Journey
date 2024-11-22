# OOP Fundamentals

## Overview
This section covers the fundamental concepts of Object-Oriented Programming in Java, including classes, objects, methods, constructors, and access modifiers.

## 📁 Directory Structure
```bash
01-oop-fundamentals/
├── docs/                          # Documentation
│   ├── classes-and-objects.md     # Classes and Objects explanation
│   ├── methods-and-constructors.md # Methods and Constructors guide
│   ├── access-modifiers.md        # Access Modifiers documentation
│   └── README.md                  # Section overview
├── exercises/                     # Practice exercises
│   ├── basic-class-creation/      # Basic class exercises
│   │   ├── src/
│   │   │   └── com/oop/
│   │   │       ├── Book.java
│   │   │       └── Main.java
│   │   └── README.md
│   └── object-relationships/      # Object relationship exercises
└── projects/                      # Real-world applications
    ├── library-management/        # Library Management System
    │   ├── src/
    │   │   └── com/library/
    │   │       ├── models/
    │   │       ├── services/
    │   │       └── utils/
    │   └── README.md
    └── student-registration/      # Student Registration System
```

## 📚 Topics Covered

1. **Classes and Objects**
   - Class definition and structure
   - Object creation and initialization
   - Instance variables and methods
   - Static members

2. **Methods and Constructors**
   - Method declaration and implementation
   - Constructor types and usage
   - Method overloading
   - Parameter passing

3. **Access Modifiers**
   - Public, private, protected, default
   - Encapsulation principles
   - Package organization
   - Best practices

## 🎯 Learning Objectives

After completing this section, you should be able to:
- Create and implement Java classes
- Understand object instantiation and lifecycle
- Apply appropriate access modifiers
- Implement constructors and methods
- Design basic object relationships

## 💻 Exercises

### Basic Class Creation
Practice creating simple classes with the Book management system:
- Implementation of Book class
- Basic operations with book objects
- Running the Main class

### Object Relationships
Learn how objects interact with each other through:
- Composition
- Association
- Aggregation

## 🚀 Projects

### Library Management System
A practical project implementing:
- Book and User management
- Borrowing system
- Basic CRUD operations

### Student Registration System
A system demonstrating:
- Student enrollment
- Course management
- Grade tracking

## 🎓 Getting Started

1. Start with the documentation in the `docs` folder
2. Complete exercises in order
3. Build the projects using the provided structure

## 🛠️ Prerequisites

- Basic Java syntax knowledge
- JDK 11 or higher installed
- IDE (IntelliJ IDEA recommended)
- Git for version control

## 📝 How to Use

1. Read the theory in `docs/`
2. Complete exercises in `exercises/`
3. Build projects in `projects/`
4. Test your understanding with provided examples

## ✅ Learning Path

1. Study the documentation:
   - Start with classes-and-objects.md
   - Move to methods-and-constructors.md
   - Finish with access-modifiers.md

2. Complete exercises:
   - Basic class creation
   - Object relationships

3. Build projects:
   - Library Management System
   - Student Registration System

## 📖 Additional Resources

- [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Java OOP Concepts](https://www.w3schools.com/java/java_oop.asp)
- [Design Patterns](https://refactoring.guru/design-patterns)

## 🤝 Contributing

Feel free to:
- Submit bug reports
- Propose new exercises
- Improve documentation
- Add new project examples

## ❓ Support

If you need help:
- Check the documentation first
- Review exercise solutions
- Create an issue for complex problems


### Summary 

Object-oriented programming revolves around four main concepts: abstraction, encapsulation, inheritance, and polymorphism, each simplifying software design and functionality. 

  

### Highlights 

- 🧩 **Abstraction**: Simplifies reality by focusing on relevant data and processes.   

- 🔒 **Encapsulation**: Hides complexity by binding data and functions together, ensuring safety.   

- 🌳 **Inheritance**: Allows classes to derive properties and methods from other classes, creating a hierarchy.   

- 🔄 **Polymorphism**: Enables subclasses to implement inherited methods uniquely, allowing for flexible behavior.   

- 📚 **Class and Object**: Classes serve as templates for creating objects, defining their attributes and behaviors.   

- 🛠️ **Interface**: Programmers only need to understand the interface of a class, simplifying usage without knowing internal workings.   

- 🔍 **State of an Object**: The property values assigned to an object define its unique state within the application.   

  

### Key Insights 

- 🧠 **Understanding Objects**: An object represents any entity of interest within an application, broadening the scope of what can be modeled in software. This flexibility allows developers to represent both tangible and intangible concepts effectively.   

- 🔄 **Role of Classes**: Classes are essential as they provide a blueprint for creating objects, encapsulating both data and behavior. This modular approach aids in organizing code and promoting reuse across applications.   

- 🔒 **Benefits of Encapsulation**: By hiding the internal state and behavior of objects, encapsulation enhances data integrity and reduces the risk of unintended interference, leading to more robust applications.   

- 🌳 **Inheritance Hierarchies**: Inheritance facilitates code reuse and establishes relationships among classes, allowing developers to build complex systems with shared behavior while minimizing redundancy.   

- 🔄 **Polymorphism in Action**: This concept allows for flexibility in code behavior, enabling subclasses to modify inherited methods, which is crucial for creating adaptable and maintainable software.   

- 📚 **Interface vs. Implementation**: By focusing on interfaces, programmers can utilize classes without needing to understand their complexities, fostering collaboration and allowing for easier modifications.   

- ⚖️ **Data Integrity through Properties**: Assigning values to properties at instantiation ensures each object maintains its unique state, providing a mechanism for enforcing rules and validation, which is vital for maintaining data integrity.   


# HKMU JAVA APPLICATION DEVELOPMENT
## LECTURE 01: OBJECT ORIENTED PROGRAMMING

### Core OOP Concepts
1. Data Abstraction
2. Encapsulation/Information Hiding
3. Inheritance
4. Polymorphism

### Java Implementation Concepts
1. Class Definition
2. Access Modifiers (Public Interface)
3. Constructors
   - Default (No-arg)
   - Parameterized
4. Member Functions (Methods)
5. Object Creation
6. Member Access
7. Special Keywords
   - 'this' keyword
8. Static Members
   - Variables
   - Methods
   - Fields/Attributes

### Class Structure Example: BankAccount
```java
public class BankAccount {
    // Fields (Data Members)
    private double balance;
    private String accountHolder;

    // Default Constructor
    public BankAccount() {
        this.balance = 0;
        this.accountHolder = "";
    }

    // Parameterized Constructor
    public BankAccount(double openingBalance, String accountHolder) {
        this.balance = openingBalance;
        this.accountHolder = accountHolder;
    }

    // Member Functions (Methods)
    public double withdraw(double amount) {
        // Implementation
    }
    
    public void deposit(double amount) {
        // Implementation
    }
    
    public double getBalance() {
        // Implementation
    }
}
```
### Encapsulation/Information Hiding

#### Access Modifiers
Controls access to class members (variables and methods)

1. `public`
   - Accessible from anywhere
   - Any class can access
   - Least restrictive

2. `protected`
   - Accessible within:
     - Same class
     - Subclasses
     - Same package

3. `private`
   - Accessible only within same class
   - Most restrictive
   - Best for encapsulation

#### Visibility Table
| Modifier   | Class | Package | Subclass | World |
|------------|-------|---------|----------|-------|
| public     | Yes   | Yes     | Yes      | Yes   |
| protected  | Yes   | Yes     | Yes      | No    |
| private    | Yes   | No      | No       | No    |
| (default)  | Yes   | Yes     | No       | No    |

#### Example
```java
public class BankAccount {
    // Private fields (data hiding)
    private double balance;
    private String accountHolder;

    // Public methods (interface)
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
```

### Java Implementation Concepts
1. Class Definition
2. Access Modifiers (Public Interface)
3. Constructors
   - Default (No-arg)
   - Parameterized
4. Member Functions (Methods)
5. Object Creation
6. Member Access
7. Special Keywords
   - 'this' keyword
8. Static Members
   - Variables
   - Methods
   - Fields/Attributes

#### Specific coverage: 1-6

### Java Implementation Concepts

1. Class Definition
   - Blueprint for objects
   - Syntax: `public class ClassName { }`
   - Contains:
     - Fields (attributes)
     - Methods (behavior)
     - Constructors
   ```java
   public class Car {
       private String model;
       private int year;
   }
   ```

2. Access Modifiers
   - public: accessible everywhere
   - private: only within class
   - protected: class, package, subclasses
   - default: class and package only
   ```java
   public class Student {
       private int id;          // only within class
       public String name;      // accessible anywhere
       protected int grade;     // class, package, subclasses
       int section;            // default: package access
   }
   ```

3. Constructors
   ```java
   public class Book {
       private String title;
       
       // Default Constructor
       public Book() {
           title = "Untitled";
       }
       
       // Parameterized Constructor
       public Book(String bookTitle) {
           title = bookTitle;
       }
   }
   ```

4. Member Functions (Methods)
There are four member functions defined for the class "BankAccount"
- getBalance()
- getAccount()
- setBalance()
- setAccountHolder()

4. Member Functions (Methods)

Common Types of Methods:
1. Accessor Methods (Getters)
   - Return private data
   - Usually start with "get"
2. Mutator Methods (Setters)
   - Modify private data
   - Usually start with "set"

Example using BankAccount class:
```java
public class BankAccount {
    private double balance;
    private String accountHolder;

    // Accessor Methods (Getters)
    public double getBalance() {
        return balance;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }

    // Mutator Methods (Setters)
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    
    public void setAccountHolder(String newHolder) {
        this.accountHolder = newHolder;
    }
}
```

Other Method Examples:
```java
public class Calculator {
    // Method with return and parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Void method (no return value)
    public void display(String message) {
        System.out.println(message);
    }
}
```

Usage:
```java
BankAccount account = new BankAccount();
account.setAccountHolder("John Doe");    // Setter
String holder = account.getAccountHolder(); // Getter
```


5. Object Creation
   ```java
   public class Main {
       public static void main(String[] args) {
           // Using default constructor
           Book book1 = new Book();
           
           // Using parameterized constructor
           Book book2 = new Book("Java Programming");
           
           // Creating multiple objects
           Calculator calc = new Calculator();
       }
   }
   ```

6. Member Access
   ```java
   public class Main {
       public static void main(String[] args) {
           Calculator calc = new Calculator();
           
           // Accessing methods
           int sum = calc.add(5, 3);
           calc.display("Result: " + sum);
           
           // Accessing public fields
           Student student = new Student();
           student.name = "John";    // OK if public
           // student.id = 101;      // Error if private
       }
   }
   ```

Common Usage Pattern:
```java
// Define class
public class Student {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void study() {
        System.out.println(name + " is studying");
    }
}

// Use class
public class Main {
    public static void main(String[] args) {
        // Create object
        Student student = new Student("Alice", 20);
        
        // Access members
        student.study();
    }
}
```
## Types of Constructors
```java
public class BankAccount {
    private double balance;
    private String accountHolder;

    // Default constructor (automatically provided if no constructor is defined)
    // Java creates: public BankAccount() { }

    // No-argument constructor (explicitly written)
    public BankAccount() {
        balance = 0.0;
        accountHolder = "";
    }

    // Explicit value constructor (parameterized constructor)
    public BankAccount(double initialBalance, String holder) {
        balance = initialBalance;
        accountHolder = holder;
    }
}
```

Key Points:
1. **Default Constructor**
   - Created by Java if no constructor is defined
   - Invisible in code
   - Initializes fields to default values (0, null, false)

2. **No-argument Constructor**
   - Explicitly written by programmer
   - Takes no parameters
   - Can set specific initial values

3. **Explicit Value Constructor**
   - Takes parameters
   - Allows object creation with specific values
   - Also called parameterized constructor

Usage Example:
```java
// Using default constructor (if no other constructors exist)
BankAccount acc1 = new BankAccount();

// Using no-argument constructor
BankAccount acc2 = new BankAccount();

// Using explicit value constructor
BankAccount acc3 = new BankAccount(1000.0, "John Doe");
```