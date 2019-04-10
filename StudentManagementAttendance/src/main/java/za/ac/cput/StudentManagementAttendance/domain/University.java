package za.ac.cput.StudentManagementAttendance.domain;

public class University {
    String universityName, universityAddress;
    int universityID;

    private University(String universityName, String universityAddress, int universityID) {
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.universityID = universityID;
    }

    private String getUniversityName() {
        return universityName;
    }

    private void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    private String getUniversityAddress() {
        return universityAddress;
    }

    private void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    private int getUniversityID() {
        return universityID;
    }

    private void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", universityID=" + universityID +
                '}';
    }
}
