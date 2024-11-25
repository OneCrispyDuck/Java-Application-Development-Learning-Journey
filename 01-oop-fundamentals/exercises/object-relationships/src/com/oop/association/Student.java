// Student.java
package com.oop.association;

public class Student {
    // Private fields for encapsulation
    private String studentId;
    private String name;
    private Course course;  // Association - Student has a Course

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        this.course = course;
    }

    // Getters and setters
    public Course getCourse() {
        return course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}