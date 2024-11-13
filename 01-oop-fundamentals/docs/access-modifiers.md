# Access Modifiers in Java

## Overview
Access modifiers in Java control the visibility and accessibility of classes, methods, and fields.

## Types of Access Modifiers

### 1. public
- Accessible from any class
- Highest level of accessibility
- Example:
```java
public class User {
    public String name;
    public void display() { }
}
```
### 2. private
- Accessible only within the same class
- Highest level of encapsulation

Example:
```java
public class BankAccount {
    private double balance;
    private String accountNumber;
}
```
### 3. protected
- Accessible within:
    - Same class
    - Same package
    - Subclasses (even in different packages)

Example: 
```java
public class Animal {
    protected void eat() { }
}
```

### default (package-private)
- No modifier specified
- Accessible within:
    - Same class
    - Same package

Example:
```java
class Helper {
    void utility() { }
}
```

## Access Levels Table
```markdown
| Modifier    | Class | Package | Subclass | World |
|-------------|-------|---------|----------|-------|
| public      | ✓     | ✓       | ✓        | ✓     |
| protected   | ✓     | ✓       | ✓        | ✗     |
| default     | ✓     | ✓       | ✗        | ✗     |
| private     | ✓     | ✗       | ✗        | ✗     |
```

### Best Practices
1. Use private for fields to enforce encapsulation
2. Provide public getters/setters when needed
3. Use protected for methods that subclasses might need to override
4. Use public only when necessary for external access

