-- Sample Data for Testing

-- Insert Users
INSERT INTO users (username, email, password_hash) VALUES
('john_doe', 'john@example.com', 'hashed_password_1'),
('jane_smith', 'jane@example.com', 'hashed_password_2'),
('instructor1', 'instructor@example.com', 'hashed_password_3');

-- Insert Courses
INSERT INTO courses (title, description, instructor_id) VALUES
('Java Basics', 'Introduction to Java Programming', 3),
('Advanced OOP', 'Deep dive into Object-Oriented Programming', 3),
('Design Patterns', 'Common design patterns in Java', 3);

-- Insert Enrollments
INSERT INTO enrollments (user_id, course_id) VALUES
(1, 1),  -- John enrolled in Java Basics
(1, 2),  -- John enrolled in Advanced OOP
(2, 1);  -- Jane enrolled in Java Basics

-- Add more sample data as needed

