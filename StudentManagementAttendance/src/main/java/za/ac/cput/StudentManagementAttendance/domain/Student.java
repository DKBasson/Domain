package za.ac.cput.StudentManagementAttendance.domain;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;

/**
 * Hello world!
 */
public class Student {
    private String sName, sSurname, datesNotAttended;
    private int ssStudentNum, numNotAttended;

    public Student(Builder builder) {
        this.sName = builder.sName;
        this.sSurname = builder.sSurname;
        this.datesNotAttended = builder.datesNotAttended;
        this.ssStudentNum = builder.ssStudentNum;
        this.numNotAttended = builder.numNotAttended;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSurname() {
        return sSurname;
    }

    public void setsSurname(String sSurname) {
        this.sSurname = sSurname;
    }

    public String getDatesNotAttended() {
        return datesNotAttended;
    }

    public void setDatesNotAttended(String datesNotAttended) {
        this.datesNotAttended = datesNotAttended;
    }

    public int getSsStudentNum() {
        return ssStudentNum;
    }

    public void setSsStudentNum(int ssStudentNum) {
        this.ssStudentNum = ssStudentNum;
    }

    public int getNumNotAttended() {
        return numNotAttended;
    }

    public void setNumNotAttended(int numNotAttended) {
        this.numNotAttended = numNotAttended;
    }

    public static class Builder{
        String sName, sSurname, datesNotAttended;
        int ssStudentNum, numNotAttended;

        public Builder sName(String sName) {
            this.sName = sName;
            return this;
        }

        public Builder sSurname(String sSurname) {
            this.sSurname = sSurname;
            return this;
        }

        public Builder datesNotAttended(String datesNotAttended) {
            this.datesNotAttended = datesNotAttended;
            return this;
        }

        public Builder ssStudentNum(int ssStudentNum) {
            this.ssStudentNum = ssStudentNum;
            return this;
        }

        public Builder numNotAttended(int numNotAttended) {
            this.numNotAttended = numNotAttended;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sSurname='" + sSurname + '\'' +
                ", datesNotAttended='" + datesNotAttended + '\'' +
                ", ssStudentNum=" + ssStudentNum +
                ", numNotAttended=" + numNotAttended +
                '}';
    }
}
