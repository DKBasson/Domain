package za.ac.cput.StudentManagementAttendance.domain;

public class Subject {
    private String subjectName;
    private int subjectID;

    private Subject(Builder builder) {
        this.subjectName = builder.subjectName;
        this.subjectID = builder.subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public static class Builder {
        String subjectName;
        int subjectID;

        public Builder subjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder subjectID(int subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }

    }


    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectID=" + subjectID +
                '}';
    }
}
