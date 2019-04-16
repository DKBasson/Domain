package za.ac.cput.StudentManagementAttendance.factory.punishmentTypesFactory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class ExpulsionFactory extends Student {

    private ExpulsionFactory(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public ExpulsionFactory build(){
            return new ExpulsionFactory(this);
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
