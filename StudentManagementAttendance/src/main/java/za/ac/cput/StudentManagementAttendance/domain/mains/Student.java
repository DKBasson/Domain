package za.ac.cput.StudentManagementAttendance.domain.mains;

import java.util.Objects;

/**
 * Hello world!
 */
public class Student {
    private String sName, sSurname, datesNotAttended, ssStudentNum;
    private int numNotAttended;

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

    public String getSsStudentNum() {
        return ssStudentNum;
    }

    public void setSsStudentNum(String ssStudentNum) {
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
        String ssStudentNum;
        int numNotAttended;

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

        public Builder ssStudentNum(String ssStudentNum) {
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student studentVar = (Student) o;
        return ssStudentNum.equals(studentVar.ssStudentNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssStudentNum);
    }
}
