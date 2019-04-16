package za.ac.cput.StudentManagementAttendance.domain.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class Suspension extends Student {

    private Suspension(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Suspension build(){
            return new Suspension(this);
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
