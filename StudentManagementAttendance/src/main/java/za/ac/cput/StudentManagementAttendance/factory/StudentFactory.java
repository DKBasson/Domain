package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class StudentFactory {
    public static Student getStudent(String sName, String sSurname, String datesNotAttended, String ssStudentNumber, int numNotAttended) {
        return new Student.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
