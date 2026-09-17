package com.attendance;

public class Main {

    public static void main(String[] args) {

        AttendanceManager manager = new AttendanceManager();

        Attendance student1 =
                new Attendance(101, "Arun", 100, 85);

        Attendance student2 =
                new Attendance(102, "Bala", 100, 70);

        Attendance student3 =
                new Attendance(103, "Charan", 80, 64);

        System.out.println("Attendance Eligibility System");
        System.out.println("=============================");

        manager.displayAttendance(student1);
        manager.displayAttendance(student2);
        manager.displayAttendance(student3);
    }
}