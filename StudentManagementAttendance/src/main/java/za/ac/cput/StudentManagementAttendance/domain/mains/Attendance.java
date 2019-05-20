package za.ac.cput.StudentManagementAttendance.domain.mains;

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
    }


