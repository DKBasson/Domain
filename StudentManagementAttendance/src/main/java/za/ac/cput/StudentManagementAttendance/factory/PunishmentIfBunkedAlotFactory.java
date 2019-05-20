package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class PunishmentIfBunkedAlotFactory {
    public static PunishmentIfBunkedAlot getStudent(String studentID, int punishmentID) {
        return new PunishmentIfBunkedAlot.Builder().studentID(studentID).punishmentID(punishmentID).build();
    }
}
