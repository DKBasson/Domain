package za.ac.cput.StudentManagementAttendance.domain;

public class Venue {
    private int venueNumber;

    private Venue(Builder builder) {
        this.venueNumber = builder.venueNumber;
    }

    public int getVenueNumber() {
        return venueNumber;
    }

    public void setVenueNumber(int venueNumber) {
        this.venueNumber = venueNumber;
    }

    public static class Builder {
        int venueNumber;

        public Builder venueNumber(int venueNumber) {
            this.venueNumber = venueNumber;
            return this;
        }

        public Venue build() {
            return new Venue(this);
        }
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueNumber=" + venueNumber +
                '}';
    }
}
