package za.ac.cput.StudentManagementAttendance.domain.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class MDStudent extends Student {

    private MDStudent(Builder builder) {
        super(builder);
    }
    public static class Builder extends Student.Builder {
        public MDStudent build(){
            return new MDStudent(this);
        }
    }
    @Override
    public String toString() {
        return "MDStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}
