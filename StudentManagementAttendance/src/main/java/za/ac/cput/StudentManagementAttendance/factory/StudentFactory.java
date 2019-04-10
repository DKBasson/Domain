package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class StudentFactory {
    String sName, sSurname, datesNotAttended;
    int ssStudentNum, numNotAttended;

    public StudentFactory(String sName, String sSurname, String datesNotAttended, int ssStudentNum, int numNotAttended) {
        this.sName = sName;
        this.sSurname = sSurname;
        this.datesNotAttended = datesNotAttended;
        this.ssStudentNum = ssStudentNum;
        this.numNotAttended = numNotAttended;
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
}
