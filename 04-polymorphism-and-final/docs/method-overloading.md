# Method Overloading in Java

## Overview
Method overloading is a feature that allows a class to have multiple methods with the same name but different parameters.

## Key Concepts
1. Methods can be overloaded by:
   - Number of parameters
   - Data type of parameters
   - Order of parameters

## Examples

### 1. Different Number of Parameters
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}