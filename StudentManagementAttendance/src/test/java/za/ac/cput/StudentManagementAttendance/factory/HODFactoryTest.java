package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.HOD;

public class HODFactoryTest {
    public static HOD getHOD(String memberName, String memberSurname, int memberID) {
        return new HOD.Builder().memberName(memberName).memberSurname(memberSurname).memberID(memberID).build();
    }

}
