package com.attendance;

public class Attendance {

    private int studentId;
    private String studentName;
    private int totalClasses;
    private int attendedClasses;

    public Attendance(int studentId, String studentName,
                      int totalClasses, int attendedClasses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }
}