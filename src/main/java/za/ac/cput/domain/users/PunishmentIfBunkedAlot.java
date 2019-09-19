package za.ac.cput.domain.users;

public class PunishmentIfBunkedAlot {
    private String userID, firstName, lastName, email;

    public PunishmentIfBunkedAlot(Builder builder) {
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public PunishmentIfBunkedAlot(){

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

        public PunishmentIfBunkedAlot.Builder copy(PunishmentIfBunkedAlot punishmentIfBunkedAlot){
            this.userID = punishmentIfBunkedAlot.userID;
            this.firstName = punishmentIfBunkedAlot.firstName;
            this.lastName = punishmentIfBunkedAlot.lastName;
            this.email = punishmentIfBunkedAlot.email;
            return this;
        }

        public PunishmentIfBunkedAlot build(){
            return new PunishmentIfBunkedAlot(this);
        }
    }

    @Override
    public String toString() {
        return "PunishmentIfBunkedAlotFactory{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PunishmentIfBunkedAlot)) return false;

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = (PunishmentIfBunkedAlot) o;

        if (getUserID() != null ? !getUserID().equals(punishmentIfBunkedAlot.getUserID()) : punishmentIfBunkedAlot.getUserID() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(punishmentIfBunkedAlot.getFirstName()) : punishmentIfBunkedAlot.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(punishmentIfBunkedAlot.getLastName()) : punishmentIfBunkedAlot.getLastName() != null)
            return false;
        return getEmail() != null ? getEmail().equals(punishmentIfBunkedAlot.getEmail()) : punishmentIfBunkedAlot.getEmail() == null;
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


