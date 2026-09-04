public class Student extends User {

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
