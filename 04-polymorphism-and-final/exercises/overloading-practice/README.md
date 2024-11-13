# Shape Area Calculator

## Overview
This exercise demonstrates method overloading in Java by implementing different area calculations for various shapes.

## Project Structure
- `Shape.java`: Contains the main Shape class with overloaded methods
- `Main.java`: Contains the test program
- `ShapeTest.java`: Contains unit tests

## How to Run
1. Compile the files:
```bash
   javac com/exercise/*.java
```
2. Run the program:
```bash
java com.exercise.Main

Testing:
Run the unit tests:

nvm test
```
3. 'pom.xml':
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.exercise</groupId>
    <artifactId>overloading-practice</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <junit.version>5.8.2</junit.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```
4. ShapeTest.java:
```java
package com.exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    private static final double DELTA = 0.001;
    private Shape shape = new Shape();

    @Test
    void testCircleArea() {
        assertEquals(78.539, shape.calculateArea(5), DELTA);
    }

    @Test
    void testRectangleArea() {
        assertEquals(24.0, shape.calculateArea(4, 6), DELTA);
    }

    @Test
    void testTriangleArea() {
        assertEquals(6.0, shape.calculateArea(3, 4, 5), DELTA);
    }
}
```
