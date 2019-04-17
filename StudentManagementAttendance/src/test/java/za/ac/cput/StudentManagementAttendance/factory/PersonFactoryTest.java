package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Person;

public class PersonFactoryTest {
    public static Person getPerson(String sName, String sSurname) {
        return new Person.Builder().personName(sName).personSurname(sSurname).build();
    }
}
