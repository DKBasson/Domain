package za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;

public class Business extends StudentSponsor {

    private Business(Builder builder) {
        super(builder);
    }

    public static class Builder extends StudentSponsor.Builder {
        public Business build(){
            return new Business(this);
        }
    }
    @Override
    public String toString() {
        return "Business{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", sponsorNum" + getSponsorNum() +
                '}';
    }
}
