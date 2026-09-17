package com.attendance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AttendanceManagerTest {

    @Test
    public void testCalculatePercentage() {
        AttendanceManager manager = new AttendanceManager();

        Attendance student =
                new Attendance(101, "Arun", 100, 85);

        assertEquals(85, manager.calculatePercentage(student), 0.01);
    }

    @Test
    public void testEligibleStudent() {
        AttendanceManager manager = new AttendanceManager();

        Attendance student =
                new Attendance(101, "Arun", 100, 85);

        assertTrue(manager.isEligible(student));
    }

    @Test
    public void testNotEligibleStudent() {
        AttendanceManager manager = new AttendanceManager();

        Attendance student =
                new Attendance(102, "Bala", 100, 70);

        assertFalse(manager.isEligible(student));
    }

    @Test
    public void testExactly75Percent() {
        AttendanceManager manager = new AttendanceManager();

        Attendance student =
                new Attendance(103, "Charan", 80, 60);

        assertTrue(manager.isEligible(student));
    }
}