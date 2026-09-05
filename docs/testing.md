# Testing Documentation

## 1. Testing Objective

The objective of testing is to verify that all major modules of the Smart Student Management System work correctly and produce the expected results.

## 2. Testing Environment

- Programming Language: Java
- Java Version: 17
- Database: MySQL
- Database Connectivity: JDBC
- Build Tool: Maven
- IDE: IntelliJ IDEA
- Operating System: Windows

## 3. Functional Testing

| Test Case | Input | Expected Result | Status |
|-----------|-------|-----------------|--------|
| Add Student | Valid student details | Student added successfully | Pass |
| View Students | Option 2 | All students displayed | Pass |
| Search Student | Student ID 101 | Student details displayed | Pass |
| Update Student | Valid updated details | Student updated successfully | Pass |
| Delete Student | Valid student ID | Student deleted successfully | Pass |
| Add Academic Record | Marks between 0-100 | Record added with calculated grade | Pass |
| View Academic Records | Student ID 101 | Academic records displayed | Pass |
| Add Attendance | Valid attendance values | Attendance percentage calculated | Pass |
| View Attendance | Student ID 101 | Attendance details displayed | Pass |
| Generate Report | Student ID 101 | Report generated successfully | Pass |

## 4. Validation Testing

The system validates student information and academic/attendance values.

Examples:

- Student ID must be greater than zero.
- Student name cannot be empty.
- Email must contain a valid basic email format.
- Course cannot be empty.
- Marks must be between 0 and 100.
- Total classes must be greater than zero.
- Attended classes cannot exceed total classes.

## 5. Exception Handling Testing

Invalid inputs were tested to verify that the system handles errors without terminating unexpectedly.

Example:

```text
Input:
Student ID = -1

Expected Output:
Validation Error: Student ID must be greater than zero.
6. Attendance Warning Testing

Attendance below 75% is identified by the system.

Example:

Attendance = 70.00%

Status : WARNING - Below 75%

Attendance of 75% or above is displayed as satisfactory.

7. Multithreading Testing

The report generation process was tested using the ReportThread class.

The system displays the thread name during report generation.

Example:

Report generation started.
Running in thread: Thread-0
Report generated successfully.
Report generation completed.
8. File I/O Testing

The system generates student reports using Java File I/O.

Generated reports are stored in:

reports/

Example:

reports/Student_Report_101.txt
9. Database Testing

JDBC operations were tested for:

Student insertion
Student retrieval
Student update
Student deletion
Academic record insertion
Academic record retrieval
Attendance insertion
Attendance retrieval
10. Final Test Result

All major functional modules were tested successfully.

The system successfully demonstrates:

Student Management
Academic Management
Attendance Management
MySQL Database Connectivity
Exception Handling
File I/O
Multithreading
Synchronization
