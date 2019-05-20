package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;

public class DDStudentPunishmentFactory {
    public static DDStudent getDDStudent(String sName, String sSurname, String datesNotAttended, String ssStudentNumber, int numNotAttended){
        return (DDStudent) new DDStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
