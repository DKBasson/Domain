package za.ac.cput.StudentManagementAttendance.domain.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class BDStudent extends Student {

    private BDStudent(Builder builder) {
        super(builder);
    }
    public static class Builder extends Student.Builder {
        public BDStudent build(){
            return new BDStudent(this);
        }
    }
    @Override
    public String toString() {
        return "BDStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}
