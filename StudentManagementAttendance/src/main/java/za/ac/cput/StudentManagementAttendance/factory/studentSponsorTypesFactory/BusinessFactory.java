package za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;

public class BusinessFactory {
    public static Business getBusiness(String sName, String sSurname, String sponsorNum) {
        return (Business) new Business.Builder().sName(sName).sSurname(sSurname).sponsorNum(sponsorNum).build();
    }
}
