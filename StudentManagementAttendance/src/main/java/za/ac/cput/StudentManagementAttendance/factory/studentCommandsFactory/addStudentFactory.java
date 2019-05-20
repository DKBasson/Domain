package za.ac.cput.StudentManagementAttendance.factory.studentCommandsFactory;

import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;

public class addStudentFactory {
    public static addStudent getAddStudent(String sName, String sSurname, String datesNotAttended, String ssStudentNumber, int numNotAttended) {
        return (addStudent) new addStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
