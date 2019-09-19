package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Attendance;

public class AttendanceFactory {
    public static Attendance getAttendance(String userID, String firstName, String lastName, String email) {
        return new Attendance.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


