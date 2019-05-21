package za.ac.cput.StudentManagementAttendance.domain.mains;

import java.util.Objects;

public class Attendance {
        private String studentID;
        private int daysMissed;

        public Attendance(Builder builder) {
            this.studentID = builder.studentID;
            this.daysMissed = builder.daysMissed;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public int getdaysMissed() {
            return daysMissed;
        }

        public void setdaysMissed(int daysMissed) {
            this.daysMissed = daysMissed;
        }


        public static class Builder {
            String studentID;
            int daysMissed;

            public Builder studentID(String studentID) {
                this.studentID = studentID;
                return this;
            }

            public Builder daysMissed(int daysMissed) {
                this.daysMissed = daysMissed;
                return this;
            }
            public Attendance.Builder copy(Attendance student){
                this.daysMissed = student.daysMissed;
                this.studentID = student.studentID;



                return this;
            }

            public Attendance build() {
                return new Attendance(this);
            }
        }

        @Override
        public String toString() {
            return "PunishmentIfBunkedAlot{" +
                    "studentID='" + studentID + '\'' +
                    ", daysMissed=" + daysMissed +
                    '}';
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendance studentVar = (Attendance) o;
        return studentID.equals(studentVar.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}



