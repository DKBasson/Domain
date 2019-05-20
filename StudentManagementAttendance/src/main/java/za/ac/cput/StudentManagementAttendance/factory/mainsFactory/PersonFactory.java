package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Person;

public class PersonFactory {
    public static Person getPerson(String sName, String sSurname) {
        return new Person.Builder().personName(sName).personSurname(sSurname).build();
    }
}
