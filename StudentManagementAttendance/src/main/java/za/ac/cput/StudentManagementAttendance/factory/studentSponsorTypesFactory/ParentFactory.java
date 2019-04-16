package za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class ParentFactory extends Student {

    private ParentFactory(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public ParentFactory build(){
            return new ParentFactory(this);
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
