package za.ac.cput.StudentManagementAttendance.domain.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;

public class ADStudent extends Student {

    private ADStudent(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public ADStudent build(){
            return new ADStudent(this);
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
