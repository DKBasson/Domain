package za.ac.cput.StudentManagementAttendance.factory.studentCommandsFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;

public class removeStudentFactory {
    public static removeStudent getRemoveStudent(String sName, String sSurname, String datesNotAttended, String ssStudentNumber, int numNotAttended) {
        return (removeStudent) new removeStudent.Builder().sName(sName).sSurname(sSurname).datesNotAttended(datesNotAttended).ssStudentNum(ssStudentNumber).numNotAttended(numNotAttended).build();
    }
}
