package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Lecturer;

public class LecturerFactory {
    public static Lecturer getLecturer(String lecturerName, String lecturerSurname, int lecturerID) {
        return new Lecturer.Builder().lecturerName(lecturerName).lecturerSurname(lecturerSurname).lecturerID(lecturerID).build();
    }
}
