package za.ac.cput.StudentManagementAttendance.domain;

/**
 * Hello world!
 *
 */
public class Student
{
   String sName, sSurname, datesNotAttended;
   int ssStudentNum, numNotAttended;
   private Student(){

   }

   private Student(String sName, String sSurname, String datesNotAttended, int ssStudentNum, int numNotAttended) {
      this.sName = sName;
      this.sSurname = sSurname;
      this.datesNotAttended = datesNotAttended;
      this.ssStudentNum = ssStudentNum;
      this.numNotAttended = numNotAttended;
   }

   private String getsName() {
      return sName;
   }

   private void setsName(String sName) {
      this.sName = sName;
   }

   private String getsSurname() {
      return sSurname;
   }

   private void setsSurname(String sSurname) {
      this.sSurname = sSurname;
   }

   private String getDatesNotAttended() {
      return datesNotAttended;
   }

   private void setDatesNotAttended(String datesNotAttended) {
      this.datesNotAttended = datesNotAttended;
   }

   private int getSsStudentNum() {
      return ssStudentNum;
   }

   private void setSsStudentNum(int ssStudentNum) {
      this.ssStudentNum = ssStudentNum;
   }

   private int getNumNotAttended() {
      return numNotAttended;
   }

   private void setNumNotAttended(int numNotAttended) {
      this.numNotAttended = numNotAttended;
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
