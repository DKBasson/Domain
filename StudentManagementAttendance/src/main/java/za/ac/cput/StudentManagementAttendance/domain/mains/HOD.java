package za.ac.cput.StudentManagementAttendance.domain.mains;

public class HOD {
    private String memberName, memberSurname;
    private String memberID;

    private HOD(Builder builder) {
        this.memberName = builder.memberName;
        this.memberSurname = builder.memberSurname;
        this.memberID = builder.memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }


    public static class Builder {
        String memberName, memberSurname;
        String memberID;

        public Builder memberName(String memberName) {
            this.memberName = memberName;
            return this;
        }

        public Builder memberID(String memberID) {
            this.memberID = memberID;
            return this;
        }

        public Builder memberSurname(String memberSurname) {
            this.memberSurname = memberSurname;
            return this;
        }

        public HOD build() {
            return new HOD(this);
        }
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
