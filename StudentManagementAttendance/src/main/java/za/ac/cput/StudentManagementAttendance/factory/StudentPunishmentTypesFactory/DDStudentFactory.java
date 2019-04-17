package za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;

public class DDStudentFactory {
    public static DDStudent getDDStudent(String sName, String sSurname, String datesNotAttended, int ssStudentNumber, int numNotAttended){
        return (DDStudent) new DDStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
