package za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class ADStudentPunishment extends PunishmentIfBunkedAlot{

    private ADStudentPunishment(Builder builder) {
        super(builder);
    }

    public static class Builder extends PunishmentIfBunkedAlot.Builder {
        public ADStudentPunishment build(){
            return new ADStudentPunishment(this);
        }
    }
    @Override
    public String toString() {
        return "ADStudentPunishment{" +
                "studentID='" + getStudentID() + '\'' +
                ", punishmentID=" + getPunishmentID() +
                '}';
    }

}
