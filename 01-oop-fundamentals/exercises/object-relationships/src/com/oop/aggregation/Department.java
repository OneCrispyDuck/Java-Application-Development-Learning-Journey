// Department.java
package com.oop.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String head;
    private List<String> programs;
    private int establishedYear;

    public Department(String name, String head, int establishedYear) {
        this.name = name;
        this.head = head;
        this.establishedYear = establishedYear;
        this.programs = new ArrayList<>();
    }

    // Add program
    public void addProgram(String program) {
        if (program != null && !program.trim().isEmpty()) {
            programs.add(program);
        }
    }

    // Department can exist independently
    public void operate() {
        System.out.println(name + " department is operating independently.");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public List<String> getPrograms() {
        return new ArrayList<>(programs);
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    @Override
    public String toString() {
        return "Department{" +
               "name='" + name + '\'' +
               ", head='" + head + '\'' +
               ", establishedYear=" + establishedYear +
               '}';
    }
}