# Smart Student Management & Academic Performance System

## 1. Project Overview

The Smart Student Management & Academic Performance System is a Java-based application designed to manage student information, academic records, attendance, and student reports.

The project demonstrates important Java programming concepts including Object-Oriented Programming, inheritance, abstraction, interfaces, exception handling, collections, multithreading, file handling, and JDBC database connectivity.

---

## 2. Problem Statement

Managing student information, academic performance, and attendance manually can be time-consuming and may lead to errors.

This project provides a centralized system for storing and managing student records, marks, attendance, and academic reports using Java and MySQL.

---

## 3. Objectives

- Manage student information efficiently.
- Store and retrieve academic records.
- Calculate grades based on marks.
- Record and calculate attendance percentage.
- Identify attendance below 75%.
- Generate student academic reports.
- Demonstrate Java OOP concepts.
- Use JDBC for database connectivity.
- Use multithreading for report generation.
- Handle invalid input using exception handling.

---

## 4. Major Features

### Student Management

- Add student
- View all students
- Search student
- Update student
- Delete student

### Academic Management

- Add academic records
- Store subject marks
- Automatically calculate grades
- View academic records

### Attendance Management

- Record attendance
- Calculate attendance percentage
- Display attendance status
- Show warning when attendance is below 75%

### Report Management

- Generate student academic report
- Store report using Java File I/O
- Generate reports using a separate thread

### Database Management

- MySQL database
- JDBC connectivity
- CRUD operations
- Relational tables with foreign keys

---

## 5. Technologies Used

- Java
- Java OOP
- JDBC
- MySQL
- Maven
- Git
- GitHub
- Java Collections
- Java Exception Handling
- Java Multithreading
- Java File I/O

---

## 6. Java Concepts Demonstrated

The project demonstrates:

- Classes and Objects
- Constructors
- Encapsulation
- Inheritance
- Abstraction
- Interfaces
- Method Overriding
- Polymorphism
- Exception Handling
- Custom Exceptions
- ArrayList
- JDBC
- SQL
- File Handling
- Multithreading
- Synchronization
- Loops
- Conditional Statements
- Switch Statements
- Strings

---

## 7. System Modules

The project consists of the following major modules:

1. Student Management
2. Academic Management
3. Attendance Management
4. Database Management
5. Report Generation
6. Exception Handling

---

## 8. Project Structure

```text
Smart-Student-Management-System
│
├── database
│   └── database.sql
│
├── reports
│   └── .gitkeep
│
├── screenshots
│   └── .gitkeep
│
├── src
│   └── main
│       └── java
│           ├── Main.java
│           ├── User.java
│           ├── Reportable.java
│           ├── Student.java
│           ├── AcademicRecord.java
│           ├── AttendanceRecord.java
│           ├── StudentDAO.java
│           ├── AcademicDAO.java
│           ├── AttendanceDAO.java
│           ├── DatabaseConnection.java
│           ├── ReportGenerator.java
│           ├── ReportThread.java
│           └── InvalidStudentException.java
│
├── pom.xml
└── README.md

9. Database Design

The system uses three main tables:

Students

Stores basic student information.

Academic Records

Stores subject-wise marks and grades.

Attendance

Stores attended classes, total classes, and attendance percentage.

The student_id field connects the tables using foreign keys.

10. Grade Calculation

The system calculates grades according to marks:

Marks	Grade
90–100	A+
80–89	A
70–79	B
60–69	C
50–59	D
Below 50	F
11. Attendance Calculation

Attendance percentage is calculated using:

Attendance Percentage =
(Attended Classes / Total Classes) × 100

If attendance is below 75%, the system displays a warning.

12. Exception Handling

The project uses a custom exception:

InvalidStudentException

It validates:

Student ID
Student name
Email
Course

Invalid data is handled without terminating the complete application.

13. Multithreading

The project uses:

ReportThread

for generating student reports.

The report generation process runs in a separate thread.

The project also uses synchronization in the report generator to avoid simultaneous access problems.

14. Installation
Step 1: Install Java

Install Java JDK 17 or later.

Step 2: Install MySQL

Install MySQL Server and MySQL Workbench.

Step 3: Clone the Repository
git clone YOUR_GITHUB_REPOSITORY_URL
Step 4: Create Database

Open MySQL Workbench and execute:

database/database.sql
Step 5: Configure Database Connection

Open:

src/main/java/DatabaseConnection.java

Update the MySQL username and password for your local system.

Do not upload your real database password to GitHub.

Step 6: Build the Project

Using Maven:

mvn clean package
Step 7: Run the Application

Run:

Main.java
15. Application Menu

The application provides the following menu:

============================================
     SMART STUDENT MANAGEMENT SYSTEM
============================================

1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Add Academic Record
7. View Academic Records
8. Add Attendance
9. View Attendance
10. Generate Student Report
0. Exit

============================================
16. Expected Output

Example:

========== ATTENDANCE RECORD ==========

Subject : Digital Logic
Classes Attended : 35
Total Classes : 50
Attendance : 70.00%
Status : WARNING - Below 75%

Example report generation:

Report generation started.
Running in thread: Thread-0
Report generated successfully.
Report generation completed.
17. Future Enhancements

Future versions of the project can include:

Graphical User Interface using JavaFX or Swing
Student login system
Admin login system
Password authentication
Dashboard
GPA calculation
PDF report generation
Email notifications
Advanced attendance analytics
Search and filtering
Data visualization
18. Conclusion

The Smart Student Management & Academic Performance System provides a structured solution for managing student academic information and attendance.

The project combines Java programming concepts with database connectivity and demonstrates how Object-Oriented Programming, exception handling, multithreading, file handling, collections, and JDBC can be integrated into a practical application.

19. Author

Name: 
Course: CSE (AIML)
University: VIT Bhopal University


### Commit it

At the bottom:

**Commit changes**

Commit message:

```text
Create project README
