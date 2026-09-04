import java.sql.*;

public class AttendanceDAO {

    public void addAttendance(AttendanceRecord record) {

        String sql =
                "INSERT INTO attendance " +
                "(student_id, subject, attended_classes, " +
                "total_classes, percentage) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, record.getStudentId());
            ps.setString(2, record.getSubject());
            ps.setInt(3, record.getAttendedClasses());
            ps.setInt(4, record.getTotalClasses());
            ps.setDouble(5, record.getPercentage());

            ps.executeUpdate();

            System.out.println(
                    "Attendance added successfully."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Error adding attendance: "
                            + e.getMessage()
            );
        }
    }

    public void displayAttendance(int studentId) {

        String sql =
                "SELECT * FROM attendance " +
                "WHERE student_id=?";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, studentId);

            ResultSet rs =
                    ps.executeQuery();

            System.out.println();
            System.out.println("===== ATTENDANCE RECORD =====");

            boolean found = false;

            while (rs.next()) {

                found = true;

                double percentage =
                        rs.getDouble("percentage");

                System.out.println(
                        "Subject : " +
                        rs.getString("subject")
                );

                System.out.println(
                        "Classes Attended : " +
                        rs.getInt("attended_classes")
                );

                System.out.println(
                        "Total Classes : " +
                        rs.getInt("total_classes")
                );

                System.out.printf(
                        "Attendance : %.2f%%%n",
                        percentage
                );

                if (percentage < 75) {

                    System.out.println(
                            "Status : WARNING - Below 75%"
                    );

                } else {

                    System.out.println(
                            "Status : Satisfactory"
                    );
                }

                System.out.println(
                        "-----------------------------"
                );
            }

            if (!found) {

                System.out.println(
                        "No attendance records found."
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error retrieving attendance: "
                            + e.getMessage()
            );
        }
    }
}
