package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class Administrator extends Student {

    private Administrator(Administrator.Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Administrator build(){
            return new Administrator(this);
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
