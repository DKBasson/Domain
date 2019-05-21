package za.ac.cput.StudentManagementAttendance.domain.mains;

public class Subject {
    private String subjectName;
    private String subjectID;

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

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public static class Builder {
        String subjectName;
        String subjectID;

        public Builder subjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder subjectID(String subjectID) {
            this.subjectID = subjectID;
            return this;
        }
        public Subject.Builder copy(Subject student){
            this.subjectName = student.subjectName;
            this.subjectID = student.subjectID;



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
