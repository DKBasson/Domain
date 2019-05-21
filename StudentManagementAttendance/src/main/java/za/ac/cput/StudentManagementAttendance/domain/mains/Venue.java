package za.ac.cput.StudentManagementAttendance.domain.mains;

public class Venue {
    private String venueNumber;

    private Venue(Builder builder) {
        this.venueNumber = builder.venueNumber;
    }

    public String getVenueNumber() {
        return venueNumber;
    }

    public void setVenueNumber(String venueNumber) {
        this.venueNumber = venueNumber;
    }

    public static class Builder {
        String venueNumber;

        public Builder venueNumber(String venueNumber) {
            this.venueNumber = venueNumber;
            return this;
        }
        public Venue.Builder copy(Venue student){
            this.venueNumber = student.venueNumber;



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
