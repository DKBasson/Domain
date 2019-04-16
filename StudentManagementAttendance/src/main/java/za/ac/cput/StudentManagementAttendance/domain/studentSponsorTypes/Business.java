package za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class Business extends Student {

    private Business(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Business build(){
            return new Business(this);
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
