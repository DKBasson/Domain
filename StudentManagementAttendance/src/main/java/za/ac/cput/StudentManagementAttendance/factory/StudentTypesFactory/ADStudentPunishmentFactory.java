package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;

public class ADStudentPunishmentFactory {
    public static ADStudent getADStudent(String sName, String sSurname, String datesNotAttended, int ssStudentNumber, int numNotAttended){
        return (ADStudent) new ADStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
