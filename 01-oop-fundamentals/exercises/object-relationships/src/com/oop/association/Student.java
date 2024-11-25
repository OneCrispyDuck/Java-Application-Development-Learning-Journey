// Basic Association
public class Student {
    private String name;
    private Course course;  // One-to-One Association
    
    public Student(String name) {
        this.name = name;
    }
    
    public void enrollInCourse(Course course) {
        this.course = course;  // Student can exist without a course
    }
}

public class Course {
    private String courseId;
    private String name;
    
    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }
    // Course can exist without students
}

// Usage
Course math = new Course("MTH101", "Mathematics");
Student john = new Student("John");
john.enrollInCourse(math);  // Objects linked but independent