package za.ac.cput.StudentManagementAttendance.domain;

public class Lecturer {
    private String lecturerName, lecturerSurname;
    private int lecturerID;

    private Lecturer(Builder builder) {
        this.lecturerName = builder.lecturerName;
        this.lecturerSurname = builder.lecturerSurname;
        this.lecturerID = builder.lecturerID;
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

    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public static class Builder {
        String lecturerName, lecturerSurname;
        int lecturerID;

        public Builder lecturerName(String lecturerName) {
            this.lecturerName = lecturerName;
            return this;
        }

        public Builder lecturerSurname(String lecturerSurname) {
            this.lecturerSurname = lecturerSurname;
            return this;
        }

        public Builder lecturerID(int lecturerID) {
            this.lecturerID = lecturerID;
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
                ", lecturerID=" + lecturerID +
                '}';
    }
}
