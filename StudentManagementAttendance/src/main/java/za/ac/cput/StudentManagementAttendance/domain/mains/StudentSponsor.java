package za.ac.cput.StudentManagementAttendance.domain.mains;

import java.util.Objects;

public class StudentSponsor {
    private String sName, sSurname, sponsorNum;


    public StudentSponsor(StudentSponsor.Builder builder) {
        this.sName = builder.sName;
        this.sSurname = builder.sSurname;
        this.sponsorNum = builder.sponsorNum;
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

    public String getSponsorNum() {
        return sponsorNum;
    }

    public void setSponsorNum(String sponsorNum) {
        this.sponsorNum = sponsorNum;
    }

    public static class Builder {
        String sName, sSurname;
        String sponsorNum;

        public StudentSponsor.Builder sName(String sName) {
            this.sName = sName;
            return this;
        }

        public StudentSponsor.Builder sSurname(String sSurname) {
            this.sSurname = sSurname;
            return this;
        }

       public StudentSponsor.Builder sponsorNum(String sponsorNum) {
            this.sponsorNum = sponsorNum;
            return this;
        }
        public StudentSponsor.Builder copy(StudentSponsor student){
            this.sName = student.sName;
            this.sSurname = student.sSurname;
            this.sponsorNum = student.sponsorNum;



            return this;
        }

        public StudentSponsor build() {
            return new StudentSponsor(this);
        }

    }

    @Override
    public String toString() {
        return "StudentSponsor{" +
                "sName='" + sName + '\'' +
                ", sSurname='" + sSurname + '\'' +
                ", sponsorNum=" + sponsorNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSponsor ssponsor = (StudentSponsor) o;
        return sponsorNum.equals(ssponsor.sponsorNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorNum);
    }
}