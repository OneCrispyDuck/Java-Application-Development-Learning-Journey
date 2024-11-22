// Aggregation Example
public class University {
    private String name;
    private List<Department> departments;  // Departments can exist independently
    
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(Department dept) {
        departments.add(dept);
    }
    
    public void removeDepartment(Department dept) {
        departments.remove(dept);  // Department continues to exist
    }
}

public class Department {
    private String name;
    private String head;
    
    public Department(String name, String head) {
        this.name = name;
        this.head = head;
    }
    // Department can exist even if University is destroyed
}

// Usage
Department cs = new Department("Computer Science", "Dr. Smith");
Department math = new Department("Mathematics", "Dr. Jones");
University university = new University("Tech U");
university.addDepartment(cs);    // Departments can be shared
university.addDepartment(math);  // or moved between universities