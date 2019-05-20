package za.ac.cput.StudentManagementAttendance.domain.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;

public class Suspension extends PunishmentIfBunkedAlot {

    private Suspension(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public Suspension build(){
            return new Suspension(this);
        }
    }
    @Override
    public String toString() {
        return "Suspension{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
