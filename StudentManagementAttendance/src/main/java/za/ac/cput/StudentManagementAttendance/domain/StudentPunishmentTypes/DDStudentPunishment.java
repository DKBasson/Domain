package za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;

public class DDStudentPunishment extends PunishmentIfBunkedAlot {

    private DDStudentPunishment(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public DDStudentPunishment build(){
            return new DDStudentPunishment(this);
        }
    }
    @Override
    public String toString() {
        return "DDStudentPunishment{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
