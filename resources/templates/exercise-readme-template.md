# Creating a Library Book Management System

## Objective
Learn to implement basic Object-Oriented Programming concepts by creating a simple library book management system. You'll practice:
- Class creation
- Encapsulation
- Object relationships
- Basic data validation

## Prerequisites
- Basic Java syntax
- Understanding of classes and objects
- Knowledge of getters and setters
- Basic understanding of arrays or ArrayLists

## Exercise Description
Create a system to manage books in a library. The system should handle books, their status (available/borrowed), and basic book operations.

### Task 1: Create the Book Class
Create a Book class with the following:

Properties:
- ISBN (String)
- Title (String)
- Author (String)
- PublicationYear (int)
- IsAvailable (boolean)

Requirements:
- All properties should be private
- Implement appropriate getters and setters
- Add input validation (e.g., ISBN cannot be empty, year cannot be future)
- Create a constructor that initializes all fields

Expected Output:
```java
public class Book {
    private String isbn;
    private String title;
    // Add other properties
    
    public Book(String isbn, String title, String author, int publicationYear) {
        // Add validation and initialization
    }
}
```
## Task 2: Create the Library Management System
Create a Library class that:

- Stores multiple books (use ArrayList)
- Has methods to:
    - Add a book
    - Remove a book
    - Search for a book by ISBN
    - Borrow a book
    - Return a book

## Getting Started
```bash
# 1. Create a new directory for your exercise
mkdir library-system
cd library-system

# 2. Create the following file structure
src/
├── com/
│   └── library/
│       ├── Book.java
│       ├── Library.java
│       └── Main.java

# 3. Implement the classes
```

## Test Cases
Your implementation should pass these scenarios:
1. Book Creation and Validation
```java
// Should work
Book book1 = new Book("123-456", "Java Programming", "John Doe", 2020);

// Should throw IllegalArgumentException
Book book2 = new Book("", "Invalid Book", "Jane Doe", 2025);
```

2. Library Operations
```java
Library library = new Library();
Book book = new Book("123-456", "Java Programming", "John Doe", 2020);

// Add book
library.addBook(book);  // Should return true

// Search book
library.findBook("123-456");  // Should return the book

// Borrow book
library.borrowBook("123-456");  // Should return true
library.borrowBook("123-456");  // Should return false (already borrowed)

// Return book
library.returnBook("123-456");  // Should return true
```

## Evaluation Criteria
-  Book class implements all required properties with proper encapsulation
-  Input validation is implemented for all setters
-  Library class successfully manages multiple books
-  All test cases pass
-  Code is well-organized and follows Java naming conventions
-  Exception handling is implemented for edge cases

## Hints
1. Use String.isEmpty() to check for empty strings
2. Consider using java.time.Year.now() for publication year validation
3. Remember to handle null values in your methods
4. Use ArrayList<Book> for storing multiple books
5. Consider implementing equals() and hashCode() for Book class

## Additional Challenges
If you complete the basic requirements, try these extensions:

1. Add a borrower tracking system
2. Implement due dates for borrowed books
3. Add categories/genres to books
4. Create a simple CLI interface

## Solution
The solution will be availbale in the 'solutions' branch after you complete the exercise.

## Common Mistakes to Avoid
1. Forgetting to validate input in setters
2. Not handling null values
3. Using public fields instead of private with getters/setters
4. Missing exception handling for edge cases

## Submission Guidelines
1. Ensure all classes are properly documented
2. Include test cases demonstrating functionality
3. Zip your src directory and submit
4. Include a brief explanation of your design decisions

```sql_more
This template provides:
1. Clear learning objectives
2. Step-by-step tasks with code examples
3. Specific test cases
4. Evaluation criteria
5. Helpful hints and common mistakes
6. Additional challenges for advanced learners

Would you like me to:
1. Show how to adapt this template for a different type of exercise?
2. Provide more detailed test cases?
3. Add more advanced challenges or extensions?
```