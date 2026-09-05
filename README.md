# Smart Student Management System

## Overview

Smart Student Management System is a Java-based application designed to manage student information, academic records, attendance, and student reports.

## Features

- Add, update, delete and search students
- View all student records
- Manage academic marks and grades
- Manage attendance records
- Generate student academic reports
- Store data using MySQL
- Generate reports using Java File I/O
- Use multithreading for report generation
- Input validation and exception handling

## Technologies Used

- Java 17
- Object-Oriented Programming
- Java Collections
- Exception Handling
- Multithreading
- File I/O
- JDBC
- MySQL
- Maven
- GitHub

## Project Structure

```text
src/main/java/
├── model/
├── dao/
├── database/
├── service/
├── exception/
├── interfacepkg/
└── Main.java
Database

The project uses MySQL database named:

student_management

Database setup instructions are available in:

database/database.sql

How to Run
Install Java 17 or later.
Install MySQL.
Create the database using database/database.sql.
Update the MySQL password in DatabaseConnection.java locally.
Build the project using Maven.
Run Main.java.
Main Modules
Student Management
Academic Management
Attendance Management
Database Management
Report Generation
Multithreading
Java Concepts Demonstrated
Classes and Objects
Constructors
Encapsulation
Inheritance
Polymorphism
Abstraction
Interfaces
Collections
Exception Handling
Multithreading
Synchronization
File Handling
JDBC
Future Enhancements
Graphical User Interface
Login and authentication
Admin dashboard
Advanced academic analytics
Export reports to PDF

Click **Commit changes**.

### ⚠️ One security check

Make sure you have **not** replaced:

```text
YOUR_MYSQL_PASSWORD
