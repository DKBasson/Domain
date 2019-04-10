package za.ac.cput.StudentManagementAttendance.domain;

public class Lecturer {
    String lecturerName, lecturerSurname;
    int lecturerID;

    private String getLecturerName() {
        return lecturerName;
    }

    private void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    private String getLecturerSurname() {
        return lecturerSurname;
    }

    private void setLecturerSurname(String lecturerSurname) {
        this.lecturerSurname = lecturerSurname;
    }

    private int getLecturerID() {
        return lecturerID;
    }

    private void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    private Lecturer(String lecturerName, String lecturerSurname, int lecturerID) {
        this.lecturerName = lecturerName;
        this.lecturerSurname = lecturerSurname;
        this.lecturerID = lecturerID;
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
