package za.ac.cput.StudentManagementAttendance.factory.studentCommandsFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class removeStudentFactory extends Student {

    private removeStudentFactory(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public removeStudentFactory build(){
            return new removeStudentFactory(this);
        }
    }
    @Override
    public String toString() {
        return "ADStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}
