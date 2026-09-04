# Use Case Diagram

## Actors

The main actors of the Smart Student Management & Academic Performance System are:

1. Teacher
2. Academic Staff
3. Student
4. System Administrator

## Use Cases

### Teacher

- Add Student
- View Student
- Update Student
- Add Academic Record
- View Academic Records
- Add Attendance
- View Attendance
- Generate Student Report

### Academic Staff

- Manage Student Records
- Manage Academic Records
- Manage Attendance
- Generate Student Reports

### Student

- View Academic Records
- View Attendance
- View Generated Report

### System Administrator

- Manage Student Data
- Manage Database
- Maintain System Records

## System Boundary

The system provides:

- Student Management
- Academic Management
- Attendance Management
- Report Generation
- Database Management
- Validation and Exception Handling

## Use Case Flow

Teacher / Academic Staff
        |
        v
Student Management
        |
        +----> Academic Management
        |
        +----> Attendance Management
        |
        +----> Report Generation
        |
        v
MySQL Database

Student
        |
        +----> View Academic Records
        |
        +----> View Attendance
        |
        +----> View Report
