package za.ac.cput.StudentManagementAttendance.domain.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;

public class Expulsion extends PunishmentIfBunkedAlot {

    private Expulsion(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public Expulsion build(){
            return new Expulsion(this);
        }
    }
    @Override
    public String toString() {
        return "Expulsion{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
