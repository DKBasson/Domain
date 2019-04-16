package za.ac.cput.StudentManagementAttendance.factory.studentCommandsFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class addStudentFactory extends Student {

    private addStudentFactory(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public addStudentFactory build(){
            return new addStudentFactory(this);
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
