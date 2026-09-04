import java.sql.*;

public class AcademicDAO {

    public void addAcademicRecord(AcademicRecord record) {

        String sql =
                "INSERT INTO academic_records " +
                "(student_id, subject, marks, grade) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, record.getStudentId());
            ps.setString(2, record.getSubject());
            ps.setInt(3, record.getMarks());
            ps.setString(4, record.getGrade());

            ps.executeUpdate();

            System.out.println(
                    "Academic record added successfully."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Error adding academic record: "
                            + e.getMessage()
            );
        }
    }

    public void displayAcademicRecords(int studentId) {

        String sql =
                "SELECT * FROM academic_records " +
                "WHERE student_id=?";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, studentId);

            ResultSet rs =
                    ps.executeQuery();

            System.out.println();
            System.out.println("===== ACADEMIC RECORD =====");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                        "Subject : " +
                        rs.getString("subject")
                );

                System.out.println(
                        "Marks   : " +
                        rs.getInt("marks")
                );

                System.out.println(
                        "Grade   : " +
                        rs.getString("grade")
                );

                System.out.println(
                        "---------------------------"
                );
            }

            if (!found) {
                System.out.println(
                        "No academic records found."
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error retrieving academic records: "
                            + e.getMessage()
            );
        }
    }
}
