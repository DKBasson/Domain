package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;

public class PunishmentIfBunkedAlot extends Student {

    private PunishmentIfBunkedAlot(PunishmentIfBunkedAlot.Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public PunishmentIfBunkedAlot build(){
            return new PunishmentIfBunkedAlot(this);
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
