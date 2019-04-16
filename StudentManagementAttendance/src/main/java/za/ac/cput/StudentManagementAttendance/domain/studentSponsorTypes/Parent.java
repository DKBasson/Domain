package za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class Parent extends Student {

    private Parent(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Parent build(){
            return new Parent(this);
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
