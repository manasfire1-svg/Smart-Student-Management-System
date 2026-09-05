package dao;

import database.DatabaseConnection;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
                "INSERT INTO students VALUES (?, ?, ?, ?)";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getCourse());

            ps.executeUpdate();

            System.out.println(
                    "Student added successfully."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Error adding student: " +
                    e.getMessage()
            );
        }
    }

    public void updateStudent(Student student) {

        String sql =
                "UPDATE students SET name=?, email=?, course=? " +
                "WHERE student_id=?";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            ps.setInt(4, student.getStudentId());

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student updated successfully."
                );

            } else {

                System.out.println(
                        "Student not found."
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error updating student: " +
                    e.getMessage()
            );
        }
    }

    public void deleteStudent(int id) {

        String sql =
                "DELETE FROM students WHERE student_id=?";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Student deleted successfully."
                );

            } else {

                System.out.println(
                        "Student not found."
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error deleting student: " +
                    e.getMessage()
            );
        }
    }

    public Student searchStudent(int id) {

        String sql =
                "SELECT * FROM students WHERE student_id=?";

        try (Connection con =
                     DatabaseConnection.getConnection();
             PreparedStatement ps =
                     con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                return new Student(
                        rs.getInt("student_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error searching student: " +
                    e.getMessage()
            );
        }

        return null;
    }

    public List<Student> getAllStudents() {

        List<Student> students =
                new ArrayList<>();

        String sql =
                "SELECT * FROM students";

        try (Connection con =
                     DatabaseConnection.getConnection();
             Statement st =
                     con.createStatement();
             ResultSet rs =
                     st.executeQuery(sql)) {

            while (rs.next()) {

                students.add(
                        new Student(
                                rs.getInt("student_id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("course")
                        )
                );
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error retrieving students: " +
                    e.getMessage()
            );
        }

        return students;
    }
}
