package za.ac.cput.StudentManagementAttendance.domain.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;

public class DDStudent extends Student {

    private DDStudent(Builder builder) {
        super(builder);
    }
    public static class Builder extends Student.Builder {
        public DDStudent build(){
            return new DDStudent(this);
        }
    }
    @Override
    public String toString() {
        return "DDStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}
