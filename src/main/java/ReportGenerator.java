import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ReportGenerator {

    public synchronized void generateReport(int studentId) {

        String fileName =
                "Student_Report_" + studentId + ".txt";

        String studentSQL =
                "SELECT * FROM students WHERE student_id=?";

        String academicSQL =
                "SELECT * FROM academic_records " +
                "WHERE student_id=?";

        String attendanceSQL =
                "SELECT * FROM attendance " +
                "WHERE student_id=?";

        try (FileWriter writer =
                     new FileWriter(fileName);
             Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement studentPS =
                     con.prepareStatement(studentSQL);
             PreparedStatement academicPS =
                     con.prepareStatement(academicSQL);
             PreparedStatement attendancePS =
                     con.prepareStatement(attendanceSQL)) {

            studentPS.setInt(1, studentId);

            ResultSet studentRS =
                    studentPS.executeQuery();

            if (!studentRS.next()) {

                writer.write("Student not found.");
                return;
            }

            writer.write(
                    "====================================\n"
            );

            writer.write(
                    "       STUDENT ACADEMIC REPORT\n"
            );

            writer.write(
                    "====================================\n\n"
            );

            writer.write(
                    "Student ID : " +
                    studentRS.getInt("student_id") +
                    "\n"
            );

            writer.write(
                    "Name       : " +
                    studentRS.getString("name") +
                    "\n"
            );

            writer.write(
                    "Email      : " +
                    studentRS.getString("email") +
                    "\n"
            );

            writer.write(
                    "Course     : " +
                    studentRS.getString("course") +
                    "\n\n"
            );

            writer.write(
                    "========== ACADEMIC RECORD ==========\n"
            );

            academicPS.setInt(1, studentId);

            ResultSet academicRS =
                    academicPS.executeQuery();

            boolean academicFound = false;

            while (academicRS.next()) {

                academicFound = true;

                writer.write(
                        "Subject : " +
                        academicRS.getString("subject") +
                        "\n"
                );

                writer.write(
                        "Marks   : " +
                        academicRS.getInt("marks") +
                        "\n"
                );

                writer.write(
                        "Grade   : " +
                        academicRS.getString("grade") +
                        "\n\n"
                );
            }

            if (!academicFound) {

                writer.write(
                        "No academic records found.\n\n"
                );
            }

            writer.write(
                    "========== ATTENDANCE RECORD ==========\n"
            );

            attendancePS.setInt(1, studentId);

            ResultSet attendanceRS =
                    attendancePS.executeQuery();

            boolean attendanceFound = false;

            while (attendanceRS.next()) {

                attendanceFound = true;

                writer.write(
                        "Subject : " +
                        attendanceRS.getString("subject") +
                        "\n"
                );

                writer.write(
                        String.format(
                                "Attendance : %.2f%%\n\n",
                                attendanceRS.getDouble(
                                        "percentage"
                                )
                        )
                );
            }

            if (!attendanceFound) {

                writer.write(
                        "No attendance records found.\n\n"
                );
            }

            writer.write(
                    "====================================\n"
            );

            writer.write(
                    "Report generated successfully.\n"
            );

            System.out.println(
                    "Report generated successfully: "
                            + fileName
            );

        } catch (SQLException | IOException e) {

            System.out.println(
                    "Report generation error: "
                            + e.getMessage()
            );
        }
    }
}
