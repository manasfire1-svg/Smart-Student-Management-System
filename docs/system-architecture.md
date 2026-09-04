# System Architecture

## 1. Architecture Overview

The Smart Student Management & Academic Performance System follows a layered architecture.

The system is divided into the following layers:

1. Presentation Layer
2. Business Logic Layer
3. Data Access Layer
4. Database Layer
5. File/Report Layer

---

## 2. Architecture Diagram

```text
+--------------------------------------------------+
|                  USER / ADMIN                    |
+-------------------------+------------------------+
                          |
                          v
+--------------------------------------------------+
|              PRESENTATION LAYER                 |
|                                                  |
|                    Main.java                    |
|              Console Menu & Input                |
+-------------------------+------------------------+
                          |
                          v
+--------------------------------------------------+
|              BUSINESS LOGIC LAYER               |
|                                                  |
|  Student       AcademicRecord   AttendanceRecord |
|                                                  |
|  User          Reportable       Validation       |
+-------------------------+------------------------+
                          |
                          v
+--------------------------------------------------+
|               DATA ACCESS LAYER                 |
|                                                  |
|  StudentDAO     AcademicDAO     AttendanceDAO    |
+-------------------------+------------------------+
                          |
                          v
+--------------------------------------------------+
|                DATABASE LAYER                   |
|                                                  |
|             DatabaseConnection.java             |
|                       |                          |
|                       v                          |
|                  MySQL Database                 |
|                                                  |
|       +------------+ +-------------+             |
|       |  students  | |  academic_  |             |
|       |            | |  records    |             |
|       +------------+ +-------------+             |
|                                                  |
|             +------------------+                 |
|             |    attendance    |                 |
|             +------------------+                 |
+--------------------------------------------------+

                          |
                          v

+--------------------------------------------------+
|               REPORT LAYER                      |
|                                                  |
|  ReportThread → ReportGenerator → Text Report    |
+--------------------------------------------------+
3. Presentation Layer

The presentation layer is responsible for interacting with the user.

Main class:

Main.java

Responsibilities:

Display the application menu.
Accept user input.
Call appropriate application operations.
Display results and error messages.
4. Business Logic Layer

This layer contains the main application objects and business rules.

Classes include:

User
Student
AcademicRecord
AttendanceRecord
InvalidStudentException

Responsibilities:

Store student information.
Validate student data.
Calculate grades.
Calculate attendance percentage.
Apply attendance rules.
Generate student summaries.
5. Data Access Layer

The Data Access Layer communicates with the database.

Classes:

StudentDAO
AcademicDAO
AttendanceDAO

Responsibilities:

Insert records.
Update records.
Delete records.
Search records.
Retrieve records.
Execute SQL queries using JDBC.
6. Database Layer

The database layer uses MySQL.

Main tables:

students
academic_records
attendance

The student_id field is used to establish relationships between the tables.

7. Report Layer

The report layer generates student reports.

Classes:

ReportThread
ReportGenerator

The ReportThread runs the report generation process in a separate thread.

ReportGenerator retrieves information from the database and writes the report into a text file.

8. Data Flow

The overall data flow is:

User Input
    ↓
Main.java
    ↓
Business Logic
    ↓
DAO Classes
    ↓
DatabaseConnection
    ↓
MySQL Database
    ↓
DAO Classes
    ↓
Main.java
    ↓
User Output

For report generation:

User
 ↓
Main
 ↓
ReportThread
 ↓
ReportGenerator
 ↓
MySQL Database
 ↓
ReportGenerator
 ↓
Text File
9. Architectural Benefits

The layered architecture provides:

Separation of responsibilities.
Easier maintenance.
Better code organization.
Reusable components.
Easier testing.
Reduced dependency between application components.
Clear separation between business logic and database operations.

### 3. Commit

Commit message:

```text
Add system architecture documentation
