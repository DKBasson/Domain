package za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentSponsor;

public class Parent extends StudentSponsor {

    private Parent(Builder builder) {
        super(builder);
    }

    public static class Builder extends StudentSponsor.Builder {
        public Parent build(){
            return new Parent(this);
        }
    }
    @Override
    public String toString() {
        return "Parent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", sponsorNum" + getSponsorNum() +
                '}';
    }
}
