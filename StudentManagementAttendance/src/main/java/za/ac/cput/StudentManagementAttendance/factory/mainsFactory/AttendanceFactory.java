package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;

public class AttendanceFactory {
    public static Attendance getAttendance(String studentID, int daysMissed) {
        return new Attendance.Builder().studentID(studentID).daysMissed(daysMissed).build();
    }
}
