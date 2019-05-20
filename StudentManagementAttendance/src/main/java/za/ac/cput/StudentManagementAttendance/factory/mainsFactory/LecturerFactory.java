package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;

public class LecturerFactory {
    public static Lecturer getLecturer(String lecturerName, String lecturerSurname, String lecturerID) {
        return new Lecturer.Builder().lecturerName(lecturerName).lecturerSurname(lecturerSurname).staffID(lecturerID).build();
    }
}
