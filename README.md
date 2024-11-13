# Java-Application-Development-Learning-Journey

## About This Repository
This repository documents my journey learning Java Development, focusing on core concepts, design patterns, and practical implementations. It serves as both a learning diary and a portfolio of my growing expertise in Java development.

## 🎯 Learning Objectives
- Master Object-Oriented Programming principles
- Develop robust Java applications
- Implement design patterns and best practices
- Build real-world projects demonstrating learned concepts

## 📚 Repository Structure
```bash
java-learning-journey/
├── 01-oop-fundamentals/
│   ├── docs/
│   │   ├── classes-and-objects.md
│   │   ├── methods-and-constructors.md
│   │   ├── access-modifiers.md
│   │   └── README.md
│   ├── exercises/
│   │   ├── basic-class-creation/
│   │   │   ├── src/
│   │   │   │   └── com/
│   │   │   │       └── oop/
│   │   │   │           ├── Book.java
│   │   │   │           └── Main.java
│   │   │   └── README.md
│   │   └── object-relationships/
│   └── projects/
│       ├── library-management/
│       │   ├── src/
│       │   │   └── com/
│       │   │       └── library/
│       │   │           ├── models/
│       │   │           ├── services/
│       │   │           └── utils/
│       │   └── README.md
│       └── student-registration/
├── 02-design-patterns/
│   ├── docs/
│   │   ├── creational/
│   │   │   ├── singleton.md
│   │   │   └── factory.md
│   │   ├── structural/
│   │   └── behavioral/
│   ├── exercises/
│   │   ├── singleton-pattern/
│   │   ├── factory-pattern/
│   │   └── observer-pattern/
│   └── projects/
│       ├── ecommerce-system/
│       └── task-manager/
├── 03-inheritance/
│   ├── docs/
│   │   ├── inheritance-basics.md
│   │   ├── method-overriding.md
│   │   └── abstract-classes.md
│   ├── exercises/
│   │   ├── class-hierarchies/
│   │   └── abstract-implementation/
│   └── projects/
│       ├── vehicle-management/
│       └── employee-hierarchy/
├── 04-polymorphism-and-final/
│   ├── docs/
│   │   ├── method-overloading.md
│   │   ├── method-overriding.md
│   │   └── final-keyword.md
│   ├── exercises/
│   │   ├── overloading-practice/
│   │   └── interface-implementation/
│   └── projects/
│       ├── shape-calculator/
│       └── payment-processor/
├── 05-exception-handling/
│   ├── docs/
│   │   ├── try-catch.md
│   │   ├── custom-exceptions.md
│   │   └── best-practices.md
│   ├── exercises/
│   │   ├── basic-exception/
│   │   └── custom-exception/
│   └── projects/
│       ├── file-processor/
│       └── banking-transactions/
├── 06-multithreading/
│   ├── docs/
│   │   ├── thread-basics.md
│   │   ├── synchronization.md
│   │   └── thread-communication.md
│   ├── exercises/
│   │   ├── basic-threads/
│   │   └── sync-practice/
│   └── projects/
│       ├── producer-consumer/
│       └── parallel-processor/
├── 07-networking/
│   ├── docs/
│   │   ├── socket-programming.md
│   │   ├── url-handling.md
│   │   └── protocols.md
│   ├── exercises/
│   │   ├── socket-basics/
│   │   └── url-handling/
│   └── projects/
│       ├── chat-app/
│       └── file-transfer/
├── 08-database/
│   ├── docs/
│   │   ├── jdbc-basics.md
│   │   ├── sql-fundamentals.md
│   │   └── transactions.md
│   ├── exercises/
│   │   ├── jdbc-operations/
│   │   └── transaction-practice/
│   └── projects/
│       ├── inventory-system/
│       └── student-database/
├── resources/
│   ├── learning-materials/
│   │   ├── recommended-books.md
│   │   └── useful-links.md
│   ├── templates/
│   │   ├── project-readme-template.md
│   │   └── exercise-readme-template.md
│   └── database-scripts/
│       ├── schema.sql
│       └── sample-data.sql
├── .gitignore
├── LICENSE
└── README.md
```
## Simplified structure of common directories
```bash
project-name/
├── src/                    # Source code
│   ├── main/              # Application code
│   │   ├── java/         # Java source files
│   │   └── resources/    # Configuration files, properties
│   └── test/             # Test code
├── target/                # Compiled files (generated)
└── pom.xml                # Project configuration

# Simplified example for beginners:
my-first-project/
├── src/
│   ├── Main.java         # Your main program
│   └── Calculator.java   # Your classes
└── README.md             # Project documentation
```

## Learning project structures
1. Maven and pom.xml
```bash
- Official Maven guide: https://maven.apache.org/guides/getting-started/
- XML = eXtensible Markup Language
- POM = Project Object Model
- pom.xml is Maven's configuration file that manages:
  - Project dependencies
  - Build settings
  - Project information
  - Version control

```
2. Java project structure best practices
```bash
Standard directory layout: https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
```
3. Understanding building tools
Maven/Gradle explained:
Build tools are like automated assistants that help you:
```bash 
1. Manage dependencies (external libraries your project needs)
2. Compile your code
3. Run tests
4. Package your application
5. Deploy your application

"Simple analogy: Think of it like cooking

Without build tool: You manually get all ingredients, prep them, follow steps
With build tool: Like having a sous chef who gets ingredients, preps them, and follows a standard recipe (defined in pom.xml/build.gradle)"
```

## Directory evolutions / project organisation patterns
As progressing in java projects, structures evolve to handle greater complexities.
See the typical stages of evolution when it comes to project structures:

1. Stage 1: Absolute Beginner
```bash
HelloWorld/
├── HelloWorld.java
└── README.md
```

2. Stage 2: Basic Project
```bash
Calculator/
├── src/
│   ├── Calculator.java
│   └── Main.java
├── README.md
└── compiled/              # Where .class files go
```

3. Stage 3: Multiple Classes
```bash
BankingApp/
├── src/
│   ├── Account.java
│   ├── Customer.java
│   ├── Transaction.java
│   └── Main.java
├── lib/                   # External libraries (manually managed)
├── compiled/
└── README.md
```

4. Stage 4: First Maven Project
```bash
BankingApp/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mybank/
│                   ├── model/
│                   │   ├── Account.java
│                   │   ├── Customer.java
│                   │   └── Transaction.java
│                   └── Main.java
├── pom.xml               # Maven configuration
└── README.md
```

5. Professional Project
```bash
BankingApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mybank/
│   │   │           ├── model/
│   │   │           ├── service/
│   │   │           ├── repository/
│   │   │           └── Main.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── mybank/
│                   └── TestCases.java
├── pom.xml
├── .gitignore
└── README.md
```

Here is another example of beginner-friendly template:
```bash
MyFirstProject/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── myproject/
│   │               ├── Main.java
│   │               └── Calculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── myproject/
│                   └── CalculatorTest.java
├── pom.xml
└── README.md

```

Here is an example of pom.xml (Basic template):
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.myproject</groupId>
    <artifactId>my-first-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>
        <!-- Add dependencies here as needed -->
    </dependencies>
</project>
```
Key Maven Commands:
```bash
mvn compile        # Compiles the code
mvn test          # Runs tests
mvn package       # Creates a JAR file
mvn clean         # Cleans previous builds
```

Foot note:
- Project organisational patterns was self taught, for my own personal developent and understanding structures outside the learning scope
of the university.


```markdown
## 🗂️ Content Overview
### 1. OOP Fundamentals
- **Documentation**: Core OOP principles and concepts
- **Exercises**: 
  - Basic class creation
  - Object relationships
  - Method implementation
- **Projects**: 
  - Library Management System
  - Student Registration System

### 2. Design Patterns
- **Documentation**: Common design patterns in Java
- **Exercises**:
  - Singleton implementation
  - Factory pattern
  - Observer pattern
- **Projects**:
  - E-commerce system using multiple patterns
  - Task management system

### 3. Inheritance
- **Documentation**: Advanced inheritance concepts
- **Exercises**:
  - Class hierarchies
  - Method overriding
  - Abstract classes
- **Projects**:
  - Vehicle management system
  - Employee hierarchy system

### 4. Polymorphism, Class, final
- **Documentation**: Types of polymorphism and class modifiers
- **Exercises**:
  - Method overloading
  - Method overriding
  - Interface implementation
  - Final keyword usage
- **Projects**:
  - Shape calculator
  - Payment processing system

### 5. Exception Handling
- **Documentation**: Exception handling mechanisms
- **Exercises**:
  - Try-catch implementations
  - Custom exceptions
  - Exception propagation
- **Projects**:
  - File processing system
  - Banking transaction system

### 6. Multithreading
- **Documentation**: Concurrent programming concepts
- **Exercises**:
  - Basic thread creation
  - Synchronization
  - Thread communication
- **Projects**:
  - Producer-consumer implementation
  - Parallel processing application

### 7. Networking
- **Documentation**: Java networking fundamentals
- **Exercises**:
  - Socket programming
  - URL handling
  - Network protocols
- **Projects**:
  - Chat application
  - File transfer program

### 8. Database
- **Documentation**: Database connectivity and operations
- **Exercises**:
  - JDBC operations
  - SQL queries
  - Transaction management
- **Projects**:
  - Inventory management system
  - Student database application

## 📈 Progress Tracking

### Current Status
- [x] OOP Fundamentals
- [ ] Design Patterns
- [ ] Inheritance
- [ ] Polymorphism, Class, final
- [ ] Exception Handling
- [ ] Multithreading
- [ ] Networking
- [ ] Database

### Projects Completed
1. [Project Name]
   - Technologies used
   - Concepts implemented
   - [View Project](link-to-project)

### In Progress
- [Current Topic/Project]
- Expected completion: [Date]

## 🌟 Key Learning Highlights
- Implemented encapsulation in banking system project
- Created reusable class hierarchies using inheritance
- Applied polymorphism for flexible code design

## 📊 Code Quality Metrics
- Maintained consistent code style following Java conventions
- Implemented unit tests for all major components
- Regular code reviews and refactoring

## 🔄 Version Control Practice
- Consistent commit messages following conventional commits
- Feature branch workflow
- Pull request reviews
- Issue tracking and management

## 🎓 Certifications & Achievements
- [Relevant certification or course completion]
- [Programming challenges completed]

## 📫 Contact & Social
- LinkedIn: gutierrez-joseph-james
- Email: upon request ~
- Portfolio: [Your Portfolio Website]

## 📝 License
This project is created as part of the Java Application Development course (COMP-S312F) at Hong Kong Metropolitan University. All rights and usage are governed by the university's academic policies.
