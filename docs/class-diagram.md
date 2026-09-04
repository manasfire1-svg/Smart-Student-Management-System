# Class Diagram

## Main Classes

### User

Abstract parent class.

Attributes:
- id
- name
- email

Methods:
- displayRole()
- displayBasicInfo()

---

### Student

Inherits from `User` and implements `Reportable`.

Attributes:
- course

Methods:
- getStudentId()
- getName()
- getEmail()
- getCourse()
- displayRole()
- generateSummary()
- validate()
- displayDetails()

---

### Reportable

Interface used for report summary generation.

Method:
- generateSummary()

---

### AcademicRecord

Stores student academic information.

Attributes:
- studentId
- subject
- marks
- grade

Methods:
- calculateGrade()
- getStudentId()
- getSubject()
- getMarks()
- getGrade()

---

### AttendanceRecord

Stores attendance information.

Attributes:
- studentId
- subject
- attendedClasses
- totalClasses
- percentage

Methods:
- getStudentId()
- getSubject()
- getAttendedClasses()
- getTotalClasses()
- getPercentage()

---

### StudentDAO

Handles database operations related to students.

Methods:
- addStudent()
- updateStudent()
- deleteStudent()
- searchStudent()
- getAllStudents()

---

### AcademicDAO

Handles academic record database operations.

Methods:
- addAcademicRecord()
- displayAcademicRecords()

---

### AttendanceDAO

Handles attendance database operations.

Methods:
- addAttendance()
- displayAttendance()

---

### DatabaseConnection

Provides JDBC database connectivity.

Method:
- getConnection()

---

### ReportGenerator

Generates student academic reports.

Method:
- generateReport()

---

### ReportThread

Extends Java `Thread`.

Method:
- run()

It executes the report generation process in a separate thread.

---

### InvalidStudentException

Custom exception used for student-data validation.

---

## Class Relationships

```text
                    <<abstract>>
                       User
                         ▲
                         |
                    inheritance
                         |
                      Student
                         |
                         | implements
                         ▼
                    Reportable


Student ──────────────── StudentDAO
   |
   ├──────────────────── AcademicDAO
   |
   └──────────────────── AttendanceDAO


AcademicRecord ───────── AcademicDAO

AttendanceRecord ─────── AttendanceDAO

StudentDAO ───────────── DatabaseConnection
AcademicDAO ──────────── DatabaseConnection
AttendanceDAO ────────── DatabaseConnection

ReportThread ─────────── ReportGenerator
                              |
                              ▼
                         DatabaseConnection

Student ──────────────── InvalidStudentException
       validation

OOP Relationships
Relationship	Implementation
Abstraction	User abstract class
Inheritance	Student extends User
Interface	Student implements Reportable
Polymorphism	displayRole() overriding
Encapsulation	Private attributes and getter methods
Exception Handling	InvalidStudentException

### 3. Commit

Use:

```text
Add class diagram documentation
