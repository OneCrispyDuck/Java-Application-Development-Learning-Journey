-- Database Schema Definition
CREATE DATABASE IF NOT EXISTS learning_management;
USE learning_management;

-- Users Table
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    role ENUM('STUDENT', 'INSTRUCTOR', 'ADMIN') DEFAULT 'STUDENT',
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT chk_email CHECK (email REGEXP '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$')
);

-- Courses Table
CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_code VARCHAR(10) NOT NULL UNIQUE,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    difficulty_level ENUM('BEGINNER', 'INTERMEDIATE', 'ADVANCED'),
    credit_hours INT DEFAULT 3,
    instructor_id INT,
    max_students INT DEFAULT 30,
    is_active BOOLEAN DEFAULT true,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (instructor_id) REFERENCES users(user_id) ON DELETE SET NULL,
    CONSTRAINT chk_credit_hours CHECK (credit_hours BETWEEN 1 AND 6)
);

-- Course Materials Table
CREATE TABLE course_materials (
    material_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    content_type ENUM('PDF', 'VIDEO', 'LINK', 'TEXT') NOT NULL,
    content TEXT NOT NULL,
    order_sequence INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE
);

-- Enrollments Table (Many-to-Many relationship between Users and Courses)
CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    course_id INT NOT NULL,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('ACTIVE', 'COMPLETED', 'DROPPED') DEFAULT 'ACTIVE',
    completion_date TIMESTAMP NULL,
    final_grade DECIMAL(5,2),
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE,
    UNIQUE KEY unique_enrollment (user_id, course_id),
    CONSTRAINT chk_final_grade CHECK (final_grade IS NULL OR final_grade BETWEEN 0 AND 100)
);

-- Assignments Table
CREATE TABLE assignments (
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    due_date TIMESTAMP NOT NULL,
    max_points INT DEFAULT 100,
    weight_percentage DECIMAL(5,2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE,
    CONSTRAINT chk_weight_percentage CHECK (weight_percentage BETWEEN 0 AND 100)
);

-- Assignment Submissions Table
CREATE TABLE assignment_submissions (
    submission_id INT PRIMARY KEY AUTO_INCREMENT,
    assignment_id INT NOT NULL,
    user_id INT NOT NULL,
    submission_text TEXT,
    submission_file_path VARCHAR(255),
    submission_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    score DECIMAL(5,2),
    feedback TEXT,
    FOREIGN KEY (assignment_id) REFERENCES assignments(assignment_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    UNIQUE KEY unique_submission (assignment_id, user_id),
    CONSTRAINT chk_score CHECK (score IS NULL OR score BETWEEN 0 AND 100)
);

-- Forums Table
CREATE TABLE forums (
    forum_id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE
);

-- Forum Posts Table
CREATE TABLE forum_posts (
    post_id INT PRIMARY KEY AUTO_INCREMENT,
    forum_id INT NOT NULL,
    user_id INT NOT NULL,
    parent_post_id INT,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (forum_id) REFERENCES forums(forum_id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (parent_post_id) REFERENCES forum_posts(post_id) ON DELETE CASCADE
);

-- Indexes for Performance Optimization
CREATE INDEX idx_course_instructor ON courses(instructor_id);
CREATE INDEX idx_enrollment_user ON enrollments(user_id);
CREATE INDEX idx_enrollment_course ON enrollments(course_id);
CREATE INDEX idx_assignment_course ON assignments(course_id);
CREATE INDEX idx_forum_course ON forums(course_id);
CREATE INDEX idx_submission_assignment ON assignment_submissions(assignment_id);
CREATE INDEX idx_submission_user ON assignment_submissions(user_id);

/*Key features of this schema:

1. Data Types:
    - INT for IDs and numbers
    - VARCHAR for strings with limited length
    - TEXT for unlimited length strings
    - TIMESTAMP for dates and times
    - ENUM for fixed sets of values
    - BOOLEAN for true/false values
    - DECIMAL for precise numeric values

2. Constraints:
    - PRIMARY KEY
    - FOREIGN KEY with ON DELETE actions
    - UNIQUE constraints
    - CHECK constraints
    - NOT NULL constraints
    - DEFAULT values

3. Relationships:
    - One-to-Many (Courses to Assignments)
    - Many-to-Many (Users to Courses via Enrollments)
    - Self-referential (Forum Posts parent/child)

4. Features:
    - Auto-incrementing IDs
    - Created/Updated timestamps
    - Soft delete capability (is_active flags)
    - Indexing for performance
    - Data validation through CHECK constraints
*/