package za.ac.cput.domain.users;

public class HOD {
    private String userID, firstName, lastName, email;

    public HOD(Builder builder) {
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public HOD(){

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static class Builder{
        private String userID, firstName, lastName, email;

        public Builder userID(String userID){
            this.userID = userID;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public HOD.Builder copy(HOD hod){
            this.userID = hod.userID;
            this.firstName = hod.firstName;
            this.lastName = hod.lastName;
            this.email = hod.email;
            return this;
        }

        public HOD build(){
            return new HOD(this);
        }
    }

    @Override
    public String toString() {
        return "HODFactory{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HOD)) return false;

        HOD hod = (HOD) o;

        if (getUserID() != null ? !getUserID().equals(hod.getUserID()) : hod.getUserID() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(hod.getFirstName()) : hod.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(hod.getLastName()) : hod.getLastName() != null)
            return false;
        return getEmail() != null ? getEmail().equals(hod.getEmail()) : hod.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserID() != null ? getUserID().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}


