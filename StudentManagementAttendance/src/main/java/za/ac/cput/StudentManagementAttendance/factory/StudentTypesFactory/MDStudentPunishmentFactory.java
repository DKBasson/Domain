package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;

public class MDStudentPunishmentFactory {
    public static MDStudent getMDStudent(String sName, String sSurname, String datesNotAttended, int ssStudentNumber, int numNotAttended){
        return (MDStudent) new MDStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
