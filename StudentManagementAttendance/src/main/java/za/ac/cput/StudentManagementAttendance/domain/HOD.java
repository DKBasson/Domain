package za.ac.cput.StudentManagementAttendance.domain;

public class HOD {
    String memberName, memberSurname;
    int memberID;

    private String getMemberName() {
        return memberName;
    }

    private void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    private String getMemberSurname() {
        return memberSurname;
    }

    private void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }

    private int getMemberID() {
        return memberID;
    }

    private void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    private HOD(String memberName, String memberSurname, int memberID) {
        this.memberName = memberName;
        this.memberSurname = memberSurname;
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "HOD{" +
                "memberName='" + memberName + '\'' +
                ", memberSurname='" + memberSurname + '\'' +
                ", memberID=" + memberID +
                '}';
    }
}
