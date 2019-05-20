package za.ac.cput.StudentManagementAttendance.factory.punishmentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class SuspensionFactory {
    public static Suspension getSuspension(String studentID, String punishmentID) {
        return (Suspension) new Suspension.Builder().studentID(studentID).punishmentID(punishmentID).build();
    }
}
