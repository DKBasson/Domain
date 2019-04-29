package za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class BusinessFactory {
    public static Student getStudent(String sName, String sSurname, String datesNotAttended, int ssStudentNumber, int numNotAttended) {
        return new Student.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
