package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;

public class HODFactory {
    public static HOD getHOD(String memberName, String memberSurname, String memberID) {
        return new HOD.Builder().memberName(memberName).memberSurname(memberSurname).memberID(memberID).build();
    }

}
