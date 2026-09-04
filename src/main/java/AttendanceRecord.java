public class AttendanceRecord {

    private int studentId;
    private String subject;
    private int attendedClasses;
    private int totalClasses;
    private double percentage;

    public AttendanceRecord(
            int studentId,
            String subject,
            int attendedClasses,
            int totalClasses) {

        if (totalClasses <= 0) {
            throw new IllegalArgumentException(
                    "Total classes must be greater than zero."
            );
        }

        if (attendedClasses < 0 ||
                attendedClasses > totalClasses) {

            throw new IllegalArgumentException(
                    "Invalid attendance values."
            );
        }

        this.studentId = studentId;
        this.subject = subject;
        this.attendedClasses = attendedClasses;
        this.totalClasses = totalClasses;

        this.percentage =
                ((double) attendedClasses / totalClasses) * 100;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public double getPercentage() {
        return percentage;
    }
}
