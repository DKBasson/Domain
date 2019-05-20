package za.ac.cput.StudentManagementAttendance.domain;

    public class PunishmentIfBunkedAlot {
        private String studentID;
        private int punishmentID;

        public PunishmentIfBunkedAlot(Builder builder) {
            this.studentID = builder.studentID;
            this.punishmentID = builder.punishmentID;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public int getPunishmentID() {
            return punishmentID;
        }

        public void setPunishmentID(int punishmentID) {
            this.punishmentID = punishmentID;
        }


        public static class Builder {
            String studentID;
            int punishmentID;

            public Builder studentID(String studentID) {
                this.studentID = studentID;
                return this;
            }

            public Builder punishmentID(int punishmentID) {
                this.punishmentID = punishmentID;
                return this;
            }

            public PunishmentIfBunkedAlot build() {
                return new PunishmentIfBunkedAlot(this);
            }
        }

        @Override
        public String toString() {
            return "PunishmentIfBunkedAlot{" +
                    "studentID='" + studentID + '\'' +
                    ", punishmentID=" + punishmentID +
                    '}';
        }
    }

