package com.attendance;

public class AttendanceManager {

    public double calculatePercentage(Attendance student) {
        return (student.getAttendedClasses() * 100.0)
                / student.getTotalClasses();
    }

    public boolean isEligible(Attendance student) {
        return calculatePercentage(student) >= 75;
    }

    public void displayAttendance(Attendance student) {
        double percentage = calculatePercentage(student);
        boolean eligible = isEligible(student);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Total Classes: " + student.getTotalClasses());
        System.out.println("Attended Classes: " + student.getAttendedClasses());
        System.out.println("Attendance Percentage: " + percentage + "%");
        System.out.println("Eligibility: "
                + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("-------------------------");
    }
}