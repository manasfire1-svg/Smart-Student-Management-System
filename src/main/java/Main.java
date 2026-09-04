import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner =
            new Scanner(System.in);

    private static final StudentDAO studentDAO =
            new StudentDAO();

    private static final AcademicDAO academicDAO =
            new AcademicDAO();

    private static final AttendanceDAO attendanceDAO =
            new AttendanceDAO();

    public static void main(String[] args) {

        int choice;

        do {

            displayMenu();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewAllStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        updateStudent();
                        break;

                    case 5:
                        deleteStudent();
                        break;

                    case 6:
                        addAcademicRecord();
                        break;

                    case 7:
                        viewAcademicRecords();
                        break;

                    case 8:
                        addAttendance();
                        break;

                    case 9:
                        viewAttendance();
                        break;

                    case 10:
                        generateReport();
                        break;

                    case 0:
                        System.out.println(
                                "Thank you for using the system."
                        );
                        break;

                    default:
                        System.out.println(
                                "Invalid choice. Try again."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "Error: " + e.getMessage()
                );
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void displayMenu() {

        System.out.println();
        System.out.println(
                "============================================"
        );
        System.out.println(
                "     SMART STUDENT MANAGEMENT SYSTEM"
        );
        System.out.println(
                "============================================"
        );

        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Add Academic Record");
        System.out.println("7. View Academic Records");
        System.out.println("8. Add Attendance");
        System.out.println("9. View Attendance");
        System.out.println("10. Generate Student Report");
        System.out.println("0. Exit");

        System.out.println(
                "============================================"
        );
    }

    private static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        Student student =
        new Student(id, name, email, course);

try {

    student.validate();

    studentDAO.addStudent(student);

} catch (InvalidStudentException e) {

    System.out.println(
            "Validation Error: " +
            e.getMessage()
    );
}
    }

    private static void viewAllStudents() {

        List<Student> students =
                studentDAO.getAllStudents();

        if (students.isEmpty()) {

            System.out.println(
                    "No students found."
            );

            return;
        }

        System.out.println();
        System.out.println(
                "========== ALL STUDENTS =========="
        );

        for (Student student : students) {

            student.displayDetails();
        }
    }

    private static void searchStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        Student student =
                studentDAO.searchStudent(id);

        if (student != null) {

            student.displayDetails();

        } else {

            System.out.println(
                    "Student not found."
            );
        }
    }

    private static void updateStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter New Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter New Course: ");
        String course = scanner.nextLine();

        Student student =
                new Student(id, name, email, course);

        studentDAO.updateStudent(student);
    }

    private static void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        studentDAO.deleteStudent(id);
    }

    private static void addAcademicRecord() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter Marks (0-100): ");
        int marks = scanner.nextInt();

        AcademicRecord record =
                new AcademicRecord(
                        studentId,
                        subject,
                        marks
                );

        System.out.println(
                "Calculated Grade: " +
                record.getGrade()
        );

        academicDAO.addAcademicRecord(record);
    }

    private static void viewAcademicRecords() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        academicDAO.displayAcademicRecords(studentId);
    }

    private static void addAttendance() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter Classes Attended: ");
        int attended = scanner.nextInt();

        System.out.print("Enter Total Classes: ");
        int total = scanner.nextInt();

        AttendanceRecord record =
                new AttendanceRecord(
                        studentId,
                        subject,
                        attended,
                        total
                );

        System.out.printf(
                "Attendance Percentage: %.2f%%%n",
                record.getPercentage()
        );

        attendanceDAO.addAttendance(record);
    }

    private static void viewAttendance() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        attendanceDAO.displayAttendance(studentId);
    }

    private static void generateReport() {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        ReportThread reportThread =
                new ReportThread(studentId);

        reportThread.start();

        try {

            reportThread.join();

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            System.out.println(
                    "Report generation interrupted."
            );
        }
    }
}
