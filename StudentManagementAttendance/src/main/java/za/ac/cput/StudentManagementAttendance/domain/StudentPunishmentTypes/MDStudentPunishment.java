package za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;

public class MDStudentPunishment extends PunishmentIfBunkedAlot {

    private MDStudentPunishment(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public MDStudentPunishment build(){
            return new MDStudentPunishment(this);
        }
    }
    @Override
    public String toString() {
        return "MDStudentPunishment{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
