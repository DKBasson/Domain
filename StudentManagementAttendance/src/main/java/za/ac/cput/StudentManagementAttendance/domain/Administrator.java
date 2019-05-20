package za.ac.cput.StudentManagementAttendance.domain;

public class Administrator {
    private String administratorName, administratorSurname;
    private int staffID;

    private Administrator(Builder builder) {
        this.administratorName = builder.administratorName;
        this.administratorSurname = builder.administratorSurname;
        this.staffID = builder.staffID;
    }

    public String getAdministratorNameName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getAdministratorSurname() {
        return administratorSurname;
    }

    public void setAdministratorSurname(String administratorSurname) {
        this.administratorSurname = administratorSurname;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public static class Builder {
        String administratorName, administratorSurname;
        int staffID;

        public Builder administratorName(String administratorName) {
            this.administratorName = administratorName;
            return this;
        }

        public Builder administratorSurname(String administratorSurname) {
            this.administratorSurname = administratorSurname;
            return this;
        }

        public Builder staffID(int staffID) {
            this.staffID = staffID;
            return this;
        }

        public Administrator build() {
            return new Administrator(this);
        }

    }


    @Override
    public String toString() {
        return "Administrator{" +
                "administratorName='" + administratorName + '\'' +
                ", administratorSurname='" + administratorSurname + '\'' +
                ", staffID=" + staffID +
                '}';
    }
}
