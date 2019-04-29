package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class Attendance extends Student {

    private Attendance(Attendance.Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public Attendance build(){
            return new Attendance(this);
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
