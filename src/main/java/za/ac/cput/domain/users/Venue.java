package za.ac.cput.domain.users;

public class Venue {
    private String venueID, venueName, venueDisc, venueLevel;

    public Venue(Builder builder) {
        this.venueID = builder.venueID;
        this.venueName = builder.venueName;
        this.venueDisc = builder.venueDisc;
        this.venueLevel = builder.venueLevel;
    }

    public Venue(){

    }

    public String getVenueID() {
        return venueID;
    }

    public void setVenueID(String venueID) {
        this.venueID = venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueDisc() {
        return venueDisc;
    }

    public void setVenueDisc(String venueDisc) {
        this.venueDisc = venueDisc;
    }

    public String getVenueLevel() {
        return venueLevel;
    }

    public void setVenueLevel(String venueLevel) {
        this.venueLevel = venueLevel;
    }
    public static class Builder{
        private String venueID, venueName, venueDisc, venueLevel;

        public Builder venueID(String venueID){
            this.venueID = venueID;
            return this;
        }

        public Builder venueName(String venueName){
            this.venueName = venueName;
            return this;
        }

        public Builder venueDisc(String venueDisc){
            this.venueDisc = venueDisc;
            return this;
        }

        public Builder venueLevel(String venueLevel){
            this.venueLevel = venueLevel;
            return this;
        }

        public Venue.Builder copy(Venue venue){
            this.venueID = venue.venueID;
            this.venueName = venue.venueName;
            this.venueDisc = venue.venueDisc;
            this.venueLevel = venue.venueLevel;
            return this;
        }

        public Venue build(){
            return new Venue(this);
        }
    }

    @Override
    public String toString() {
        return "VenueRepository{" +
                "venueID='" + venueID + '\'' +
                ", venueName='" + venueName + '\'' +
                ", venueDisc='" + venueDisc + '\'' +
                ", venueLevel='" + venueLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venue)) return false;

        Venue venue = (Venue) o;

        if (getVenueID() != null ? !getVenueID().equals(venue.getVenueID()) : venue.getVenueID() != null) return false;
        if (getVenueName() != null ? !getVenueName().equals(venue.getVenueName()) : venue.getVenueName() != null)
            return false;
        if (getVenueDisc() != null ? !getVenueDisc().equals(venue.getVenueDisc()) : venue.getVenueDisc() != null)
            return false;
        return getVenueLevel() != null ? getVenueLevel().equals(venue.getVenueLevel()) : venue.getVenueLevel() == null;
    }

    @Override
    public int hashCode() {
        int result = getVenueID() != null ? getVenueID().hashCode() : 0;
        result = 31 * result + (getVenueName() != null ? getVenueName().hashCode() : 0);
        result = 31 * result + (getVenueDisc() != null ? getVenueDisc().hashCode() : 0);
        result = 31 * result + (getVenueLevel() != null ? getVenueLevel().hashCode() : 0);
        return result;
    }
}


