package za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class BusinessFactory extends Student {

    private BusinessFactory(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public BusinessFactory build(){
            return new BusinessFactory(this);
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
