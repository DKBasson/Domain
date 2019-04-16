package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Person;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class PersonFactory {
    public static Person getPerson(String sName, String sSurname) {
        return new Person.Builder().personName(sName).personSurname(sSurname).build();
    }
}
