1. Create the file

In GitHub:

Add file → Create new file

File name:

docs/requirements.md
2. Paste this entire content
# Functional and Non-Functional Requirements

## 1. Functional Requirements

Functional requirements describe what the system must do.

### FR-01: Student Registration

The system shall allow the user to add a new student by entering:

- Student ID
- Student Name
- Email
- Course

### FR-02: View Students

The system shall display all students stored in the database.

### FR-03: Search Student

The system shall allow the user to search for a student using Student ID.

### FR-04: Update Student

The system shall allow the user to update:

- Student Name
- Email
- Course

### FR-05: Delete Student

The system shall allow the user to delete a student record using Student ID.

### FR-06: Academic Record Management

The system shall allow the user to enter:

- Student ID
- Subject
- Marks

The system shall automatically calculate the grade.

### FR-07: Academic Record Viewing

The system shall display subject-wise marks and grades for a selected student.

### FR-08: Attendance Management

The system shall allow the user to record:

- Student ID
- Subject
- Classes Attended
- Total Classes

### FR-09: Attendance Calculation

The system shall calculate attendance percentage using:

Attendance Percentage =
(Attended Classes / Total Classes) × 100

### FR-10: Attendance Warning

The system shall display a warning when a student's attendance is below 75%.

### FR-11: Report Generation

The system shall generate a student academic report containing:

- Student information
- Academic records
- Attendance records

### FR-12: File Storage

The system shall store generated student reports as text files.

### FR-13: Database Connectivity

The system shall use JDBC to connect the Java application with the MySQL database.

### FR-14: Data Validation

The system shall validate student information before storing it in the database.

### FR-15: Exception Handling

The system shall handle invalid data and database-related errors without terminating the complete application.

### FR-16: Multithreaded Report Generation

The system shall use a separate thread for report generation.

---

# 2. Non-Functional Requirements

Non-functional requirements describe the quality and operational characteristics of the system.

### NFR-01: Usability

The system shall provide a simple console-based menu that allows users to easily select operations.

### NFR-02: Performance

Database operations should execute efficiently for normal student-management operations.

### NFR-03: Reliability

The system should handle invalid input and database errors gracefully.

### NFR-04: Maintainability

The system shall be organized into separate classes and modules so that individual components can be modified easily.

### NFR-05: Security

Database credentials shall not be exposed in the public GitHub repository.

### NFR-06: Scalability

The system structure should allow additional modules such as GPA calculation, authentication, and graphical interfaces to be added in future versions.

### NFR-07: Portability

The application should run on systems supporting Java 17 or later, with a compatible MySQL installation.

### NFR-08: Extensibility

The modular architecture should allow new functionality to be added without significantly modifying existing modules.

---

# 3. Requirements Summary

| ID | Requirement Type | Requirement |
|---|---|---|
| FR-01 | Functional | Add Student |
| FR-02 | Functional | View Students |
| FR-03 | Functional | Search Student |
| FR-04 | Functional | Update Student |
| FR-05 | Functional | Delete Student |
| FR-06 | Functional | Manage Academic Records |
| FR-07 | Functional | View Academic Records |
| FR-08 | Functional | Manage Attendance |
| FR-09 | Functional | Calculate Attendance |
| FR-10 | Functional | Attendance Warning |
| FR-11 | Functional | Generate Reports |
| FR-12 | Functional | Store Reports |
| FR-13 | Functional | JDBC Database Connectivity |
| FR-14 | Functional | Data Validation |
| FR-15 | Functional | Exception Handling |
| FR-16 | Functional | Multithreaded Report Generation |
| NFR-01 | Non-Functional | Usability |
| NFR-02 | Non-Functional | Performance |
| NFR-03 | Non-Functional | Reliability |
| NFR-04 | Non-Functional | Maintainability |
| NFR-05 | Non-Functional | Security |
| NFR-06 | Non-Functional | Scalability |
| NFR-07 | Non-Functional | Portability |
| NFR-08 | Non-Functional | Extensibility |
3. Commit

Commit message:

Add functional and non-functional requirements
