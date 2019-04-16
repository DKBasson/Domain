package za.ac.cput.StudentManagementAttendance.domain.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class Expulsion extends Student {

    private Expulsion(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Expulsion build(){
            return new Expulsion(this);
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
