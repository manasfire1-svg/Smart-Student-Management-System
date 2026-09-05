package model;

public class AcademicRecord {

    private int studentId;
    private String subject;
    private int marks;
    private String grade;

    public AcademicRecord(int studentId, String subject, int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
            );
        }

        this.studentId = studentId;
        this.subject = subject;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private String calculateGrade(int marks) {

        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }
}
