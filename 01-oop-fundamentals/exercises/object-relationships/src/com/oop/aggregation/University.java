// University.java
package com.oop.aggregation;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments; // Aggregation - departments can exist independently

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to remove a department
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }
}