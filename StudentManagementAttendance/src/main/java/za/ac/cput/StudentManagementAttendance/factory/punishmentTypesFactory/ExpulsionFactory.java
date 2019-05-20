package za.ac.cput.StudentManagementAttendance.factory.punishmentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;

public class ExpulsionFactory {
    public static Expulsion getExpulsion(String studentID, String punishmentID) {
        return (Expulsion) new Expulsion.Builder().studentID(studentID).punishmentID(punishmentID).build();
    }
}
