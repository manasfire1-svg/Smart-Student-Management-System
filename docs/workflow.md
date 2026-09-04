1. Create the file

In GitHub:

Add file → Create new file

File name:

docs/workflow.md
2. Paste this entire content
# System Process / Workflow

## 1. Overall Workflow

The Smart Student Management & Academic Performance System follows the workflow below:

```text
                    START
                      |
                      v
              Display Main Menu
                      |
                      v
              Enter User Choice
                      |
          +-----------+-----------+
          |           |           |
          v           v           v
       Student    Academic    Attendance
       Module      Module       Module
          |           |           |
          v           v           v
       Validate    Validate     Validate
        Input       Input        Input
          |           |           |
          +-----------+-----------+
                      |
                      v
                DAO Classes
                      |
                      v
             JDBC Database
                      |
                      v
              MySQL Database
                      |
                      v
               Return Result
                      |
                      v
                Display Result
                      |
                      v
              Generate Report?
                 /        \
               Yes         No
                |           |
                v           v
         Report Thread    Main Menu
                |
                v
        Report Generator
                |
                v
          Text Report File
                |
                v
             Main Menu
                |
                v
               EXIT
2. Student Management Workflow
Start
  |
  v
Select Student Management
  |
  v
Enter Student Details
  |
  v
Create Student Object
  |
  v
Validate Student Details
  |
  +-------- Invalid --------+
  |                         |
  v                         v
Display Error          Enter Details Again
  |
  |
  +-------- Valid ---------+
             |
             v
        StudentDAO
             |
             v
       JDBC Connection
             |
             v
       MySQL Database
             |
             v
       Store Student
             |
             v
      Success Message
3. Academic Management Workflow
Start
  |
  v
Enter Student ID
  |
  v
Enter Subject
  |
  v
Enter Marks
  |
  v
Validate Marks
  |
  +-------- Invalid --------+
  |                         |
  v                         v
Exception               Correct Input
  |
  +-------- Valid ---------+
             |
             v
       Calculate Grade
             |
             v
        AcademicDAO
             |
             v
       MySQL Database
             |
             v
       Save Academic Record
             |
             v
        Display Result
4. Attendance Management Workflow
Start
  |
  v
Enter Student ID
  |
  v
Enter Subject
  |
  v
Enter Classes Attended
  |
  v
Enter Total Classes
  |
  v
Validate Attendance
  |
  +--------- Invalid --------+
  |                          |
  v                          v
Exception                Correct Input
  |
  +--------- Valid ---------+
             |
             v
Calculate Percentage
             |
             v
Check Attendance
             |
       +-----+------+
       |            |
       v            v
    >= 75%        < 75%
       |            |
       v            v
 Satisfactory     Warning
       |            |
       +-----+------+
             |
             v
       AttendanceDAO
             |
             v
       MySQL Database
             |
             v
        Display Result
5. Report Generation Workflow
Start
  |
  v
Select Generate Report
  |
  v
Enter Student ID
  |
  v
Create ReportThread
  |
  v
Start Thread
  |
  v
ReportGenerator
  |
  +-------------------+
  |                   |
  v                   v
Student Data     Academic Data
  |                   |
  +---------+---------+
            |
            v
      Attendance Data
            |
            v
      Generate Report
            |
            v
       Text File
            |
            v
    Report Completed
6. Database Workflow
Java Application
       |
       v
DAO Classes
       |
       v
JDBC
       |
       v
DatabaseConnection
       |
       v
MySQL
       |
       +------------------+
       |                  |
       v                  v
   INSERT/UPDATE      SELECT/DELETE
       |                  |
       +--------+---------+
                |
                v
          Database Result
                |
                v
          Java Application
7. Complete System Flow

The complete application workflow is:

The application starts.
The main menu is displayed.
The user selects an operation.
Required information is entered.
Input is validated.
Business logic is executed.
DAO classes communicate with MySQL using JDBC.
Database results are returned.
Results are displayed to the user.
If report generation is selected, a separate thread generates the report.
The application returns to the main menu.
The application terminates when the user selects Exit.

### 3. Commit

Use this commit message:

```text
Add system workflow documentation
