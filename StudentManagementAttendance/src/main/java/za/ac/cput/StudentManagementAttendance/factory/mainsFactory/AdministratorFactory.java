package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;

public class AdministratorFactory {
    public static Administrator getAdministrator(String administratorName, String administratorSurname, String staffID) {
        return new Administrator.Builder().administratorName(administratorName).administratorSurname(administratorSurname).staffID(staffID).build();
    }
}
