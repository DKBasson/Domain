package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Attendance;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class AttendanceFactory {
    public static Attendance getAttendance(String studentID, int daysMissed) {
        return new Attendance.Builder().studentID(studentID).daysMissed(daysMissed).build();
    }
}
