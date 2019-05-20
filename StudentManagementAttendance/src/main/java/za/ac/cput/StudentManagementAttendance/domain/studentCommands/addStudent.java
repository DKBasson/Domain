package za.ac.cput.StudentManagementAttendance.domain.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;

public class addStudent extends Student {

    private addStudent(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public addStudent build(){
            return new addStudent(this);
        }
    }
    @Override
    public String toString() {
        return "addStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}
