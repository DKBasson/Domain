package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class Subject extends Student {

    private Subject(Subject.Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Subject build(){
            return new Subject(this);
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
