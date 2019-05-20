package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class AdministratorFactory {
    public static Administrator getAdministrator(String administratorName, String administratorSurname, int staffID) {
        return new Administrator.Builder().administratorName(administratorName).administratorSurname(administratorSurname).staffID(staffID).build();
    }
}
