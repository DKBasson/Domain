package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;

public class StudentSponsorFactory {
    public static StudentSponsor getStudentSponsor(String sName, String sSurname, String sponsorNum) {
        return new StudentSponsor.Builder().sName(sName).sSurname(sSurname).sponsorNum(sponsorNum).build();
    }
}
