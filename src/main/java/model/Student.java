package model;

import exception.InvalidStudentException;
import interfacepkg.Reportable;

public class Student extends User implements Reportable {

    private String course;

    public Student(
            int studentId,
            String name,
            String email,
            String course) {

        super(studentId, name, email);

        this.course = course;
    }

    public int getStudentId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void displayRole() {

        System.out.println("Role : Student");
    }

    @Override
    public void generateSummary() {

        System.out.println();
        System.out.println("===== STUDENT SUMMARY =====");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("===========================");
    }

    public void validate() throws InvalidStudentException {

        if (id <= 0) {

            throw new InvalidStudentException(
                    "Student ID must be greater than zero."
            );
        }

        if (name == null || name.trim().isEmpty()) {

            throw new InvalidStudentException(
                    "Student name cannot be empty."
            );
        }

        if (email == null ||
                !email.contains("@")) {

            throw new InvalidStudentException(
                    "Invalid email address."
            );
        }

        if (course == null ||
                course.trim().isEmpty()) {

            throw new InvalidStudentException(
                    "Course cannot be empty."
            );
        }
    }

    public void displayDetails() {

        System.out.println(
                "--------------------------------"
        );

        displayBasicInfo();

        System.out.println(
                "Course: " + course
        );

        displayRole();

        System.out.println(
                "--------------------------------"
        );
    }
}
