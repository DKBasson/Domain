package za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;

public class ParentFactory {
    public static Parent getParent(String sName, String sSurname, String sponsorNum) {
        return (Parent) new Parent.Builder().sName(sName).sSurname(sSurname).sponsorNum(sponsorNum).build();
    }
}
