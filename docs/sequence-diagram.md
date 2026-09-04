# Sequence Diagram

## Add Student Sequence

The following sequence shows how a student is added to the system.

```text
User
 |
 | Enter student details
 v
Main
 |
 | Create Student object
 v
Student
 |
 | Validate student details
 v
InvalidStudentException
 |
 | Validation successful
 v
StudentDAO
 |
 | Prepare SQL INSERT statement
 v
DatabaseConnection
 |
 | Establish JDBC connection
 v
MySQL Database
 |
 | Insert student record
 |
 | Return result
 v
StudentDAO
 |
 | Display success message
 v
Main
 |
 v
User

Detailed Sequence
Step 1 — User Input

The user selects:

1. Add Student

and enters:

Student ID
Name
Email
Course
Step 2 — Student Object

Main creates a Student object using the entered information.

Step 3 — Validation

The validate() method checks the student information.

If the information is invalid, InvalidStudentException is generated.

Step 4 — DAO Operation

If validation succeeds, StudentDAO.addStudent() is called.

Step 5 — Database Connection

StudentDAO requests a database connection from:

DatabaseConnection.getConnection()
Step 6 — SQL Operation

The DAO uses a prepared SQL statement:

INSERT INTO students VALUES (?, ?, ?, ?)
Step 7 — Database Response

MySQL stores the student record and returns the operation result.

Step 8 — Confirmation

The application displays:

Student added successfully.
Report Generation Sequence

The report-generation process follows this flow:

User
 |
 | Select Generate Report
 v
Main
 |
 | Create ReportThread
 v
ReportThread
 |
 | start()
 v
ReportGenerator
 |
 | Retrieve Student Data
 |
 | Retrieve Academic Records
 |
 | Retrieve Attendance
 v
MySQL Database
 |
 | Return Data
 v
ReportGenerator
 |
 | Write Report
 v
Text File
 |
 | Report completed
 v
User
Components Involved
User
Main
Student
InvalidStudentException
StudentDAO
DatabaseConnection
MySQL
ReportThread
ReportGenerator
Text File

### 3. Commit

Commit message:

```text
Add sequence diagram documentation
