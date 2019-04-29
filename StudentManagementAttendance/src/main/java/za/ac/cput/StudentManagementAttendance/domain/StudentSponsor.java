package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class StudentSponsor extends Student {

    private StudentSponsor(StudentSponsor.Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public StudentSponsor build(){
            return new StudentSponsor(this);
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
