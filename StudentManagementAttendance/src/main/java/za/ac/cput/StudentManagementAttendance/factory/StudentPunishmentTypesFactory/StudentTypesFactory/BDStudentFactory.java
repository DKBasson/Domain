package za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory.StudentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;

public class BDStudentFactory {
    public static BDStudent getBDStudent(String sName, String sSurname, String datesNotAttended, int ssStudentNumber, int numNotAttended){
        return (BDStudent) new BDStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
