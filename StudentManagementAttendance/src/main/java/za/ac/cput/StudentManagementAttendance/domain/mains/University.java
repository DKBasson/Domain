package za.ac.cput.StudentManagementAttendance.domain.mains;

public class University {
    private String universityName, universityAddress;
    private String universityID;

    private University(Builder builder) {
        this.universityName = builder.universityName;
        this.universityAddress = builder.universityAddress;
        this.universityID = builder.universityID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public static class Builder {
        String universityName, universityAddress;
        String universityID;

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder universityAddress(String universityAddress) {
            this.universityAddress = universityAddress;
            return this;
        }

        public Builder universityID(String universityID) {
            this.universityID = universityID;
            return this;
        }

        public University build() {
            return new University(this);
        }
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
