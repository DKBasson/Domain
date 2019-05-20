package za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;

public class ADStudentFactory {
    public static ADStudent getADStudent(String sName, String sSurname, String datesNotAttended, String ssStudentNumber, int numNotAttended){
        return (ADStudent) new ADStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
