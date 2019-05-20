package za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class BDStudentPunishment extends PunishmentIfBunkedAlot {

    private BDStudentPunishment(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public BDStudentPunishment build(){
            return new BDStudentPunishment(this);
        }
    }
    @Override
    public String toString() {
        return "BDStudentPunishment{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
