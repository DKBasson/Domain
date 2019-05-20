package za.ac.cput.StudentManagementAttendance.domain.mains;

public class Lecturer {
    private String lecturerName, lecturerSurname;
    private String staffID;

    private Lecturer(Builder builder) {
        this.lecturerName = builder.lecturerName;
        this.lecturerSurname = builder.lecturerSurname;
        this.staffID = builder.staffID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerSurname() {
        return lecturerSurname;
    }

    public void setLecturerSurname(String lecturerSurname) {
        this.lecturerSurname = lecturerSurname;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public static class Builder {
        String lecturerName, lecturerSurname;
        String staffID;

        public Builder lecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
            return this;
        }

        public Builder lecturerSurname(String lecturerSurname) {
            this.lecturerSurname = lecturerSurname;
            return this;
        }

        public Builder staffID(String staffID) {
            this.staffID = staffID;
            return this;
        }

        public Lecturer build() {
            return new Lecturer(this);
        }

    }


    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerName='" + lecturerName + '\'' +
                ", lecturerSurname='" + lecturerSurname + '\'' +
                ", staffID=" + staffID +
                '}';
    }
}
