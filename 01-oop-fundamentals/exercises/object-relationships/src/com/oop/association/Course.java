// Course.java
package com.oop.association;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private List<Student> students;  // One course can have many students

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); // Return a copy to preserve encapsulation
    }
}