package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentSponsor;

public class StudentSponsorFactory {
    public static StudentSponsor getStudent(String sName, String sSurname, String sponsorNum) {
        return new StudentSponsor.Builder().sName(sName).sSurname(sSurname).sponsorNum(sponsorNum).build();
    }
}
