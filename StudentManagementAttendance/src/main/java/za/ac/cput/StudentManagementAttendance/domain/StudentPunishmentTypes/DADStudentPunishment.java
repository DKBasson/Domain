package za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class DADStudentPunishment extends Student {

    private DADStudentPunishment(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public DADStudentPunishment build(){
            return new DADStudentPunishment(this);
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
