CREATE DATABASE IF NOT EXISTS student_management;

USE student_management;


-- ==========================================
-- STUDENTS TABLE
-- ==========================================

CREATE TABLE IF NOT EXISTS students (

    student_id INT PRIMARY KEY,

    name VARCHAR(100) NOT NULL,

    email VARCHAR(100) NOT NULL,

    course VARCHAR(100) NOT NULL
);


-- ==========================================
-- ACADEMIC RECORDS TABLE
-- ==========================================

CREATE TABLE IF NOT EXISTS academic_records (

    record_id INT AUTO_INCREMENT PRIMARY KEY,

    student_id INT NOT NULL,

    subject VARCHAR(100) NOT NULL,

    marks INT NOT NULL,

    grade VARCHAR(5),

    FOREIGN KEY (student_id)
        REFERENCES students(student_id)
        ON DELETE CASCADE
);


-- ==========================================
-- ATTENDANCE TABLE
-- ==========================================

CREATE TABLE IF NOT EXISTS attendance (

    attendance_id INT AUTO_INCREMENT PRIMARY KEY,

    student_id INT NOT NULL,

    subject VARCHAR(100) NOT NULL,

    attended_classes INT NOT NULL,

    total_classes INT NOT NULL,

    percentage DOUBLE,

    FOREIGN KEY (student_id)
        REFERENCES students(student_id)
        ON DELETE CASCADE
);


-- ==========================================
-- SAMPLE STUDENTS
-- ==========================================

INSERT IGNORE INTO students
(student_id, name, email, course)
VALUES
(101, 'Rahul Sharma', 'rahul@gmail.com', 'CSE-AIML'),
(102, 'Aman Verma', 'aman@gmail.com', 'CSE-AIML'),
(103, 'Priya Singh', 'priya@gmail.com', 'CSE-AIML');


-- ==========================================
-- SAMPLE ACADEMIC RECORDS
-- ==========================================

INSERT INTO academic_records
(student_id, subject, marks, grade)
VALUES
(101, 'Java Programming', 92, 'A+'),
(101, 'Operating Systems', 84, 'A'),
(101, 'Digital Logic', 76, 'B'),

(102, 'Java Programming', 88, 'A'),
(102, 'Operating Systems', 79, 'B'),
(102, 'Digital Logic', 91, 'A+'),

(103, 'Java Programming', 95, 'A+'),
(103, 'Operating Systems', 87, 'A'),
(103, 'Digital Logic', 82, 'A');


-- ==========================================
-- SAMPLE ATTENDANCE
-- ==========================================

INSERT INTO attendance
(student_id, subject, attended_classes,
 total_classes, percentage)
VALUES
(101, 'Java Programming', 46, 50, 92.00),
(101, 'Operating Systems', 42, 50, 84.00),
(101, 'Digital Logic', 35, 50, 70.00),

(102, 'Java Programming', 45, 50, 90.00),
(102, 'Operating Systems', 38, 50, 76.00),
(102, 'Digital Logic', 47, 50, 94.00),

(103, 'Java Programming', 49, 50, 98.00),
(103, 'Operating Systems', 44, 50, 88.00),
(103, 'Digital Logic', 40, 50, 80.00);
