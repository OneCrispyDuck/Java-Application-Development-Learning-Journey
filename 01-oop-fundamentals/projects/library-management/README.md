
# Library Management System Project

## Overview
A console-based library management system demonstrating core OOP concepts through book and user management functionalities.

## Project Structure
```bash
library-management/
├── src/
│   └── com/
│       └── library/
│           ├── models/
│           │   ├── Book.java
│           │   ├── User.java
│           │   └── BorrowRecord.java
│           ├── services/
│           │   ├── BookService.java
│           │   ├── UserService.java
│           │   └── BorrowingService.java
│           └── utils/
                └── ValidationUtils.java
```

## Class Requirements

### Models

#### Book Class
  - isbn (String)
  - title (String)
  - author (String)
  - availableCopies (int)
  - totalCopies (int)

#### User Class
- Attributes:
  - id (String)
  - name (String)
  - email (String)
  - borrowedBooks (List<Book>)

#### BorrowRecord Class
- Attributes:
  - id (String)
  - book (Book)
  - user (User)
  - borrowDate (Date)
  - returnDate (Date)

### Services

#### BookService
- Methods:
  - addBook()
  - removeBook()
  - searchBook()
  - updateBook()
  - displayAllBooks()

#### UserService
- Methods:
  - registerUser()
  - removeUser()
  - updateUser()
  - displayAllUsers()

#### BorrowingService
- Methods:
  - borrowBook()
  - returnBook()
  - displayBorrowedBooks()
  - checkAvailability()

## Features to Implement
1. Add and manage books
2. Register and manage users
3. Process book borrowing
4. Handle book returns
5. Display available books
6. Show borrowed books by user

## Expected Output Example
```
Library Management System
------------------------
1. Add Book
2. Remove Book
3. Register User
4. Borrow Book
5. Return Book
6. Display Books
7. Exit

Enter your choice: 1

Add Book
--------
Enter ISBN: 123-456
Enter Title: Java Programming
Enter Author: John Doe
Enter Copies: 5

Book added successfully!
```

## Success Criteria
- [ ] All classes properly implemented
- [ ] Working book management system
- [ ] Working user management system
- [ ] Functional borrowing system
- [ ] Input validation
- [ ] Clear console interface
- [ ] Error handling
```