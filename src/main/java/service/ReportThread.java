package service;

public class ReportThread extends Thread {

    private int studentId;

    public ReportThread(int studentId) {

        this.studentId = studentId;
    }

    @Override
    public void run() {

        System.out.println(
                "Report generation started."
        );

        System.out.println(
                "Running in thread: " +
                Thread.currentThread().getName()
        );

        ReportGenerator generator =
                new ReportGenerator();

        generator.generateReport(studentId);

        System.out.println(
                "Report generation completed."
        );
    }
}
