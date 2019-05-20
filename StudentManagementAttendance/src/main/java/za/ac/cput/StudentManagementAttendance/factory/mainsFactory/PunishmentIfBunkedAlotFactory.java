package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;

public class PunishmentIfBunkedAlotFactory {
    public static PunishmentIfBunkedAlot getPunishment(String studentID, String punishmentID) {
        return new PunishmentIfBunkedAlot.Builder().studentID(studentID).punishmentID(punishmentID).build();
    }
}
