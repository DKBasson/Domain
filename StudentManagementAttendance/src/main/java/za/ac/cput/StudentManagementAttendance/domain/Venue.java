package za.ac.cput.StudentManagementAttendance.domain;

public class Venue {
    int venueNumber;

    private Venue(int venueNumber) {
        this.venueNumber = venueNumber;
    }

    private int getVenueNumber() {
        return venueNumber;
    }

    private void setVenueNumber(int venueNumber) {
        this.venueNumber = venueNumber;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueNumber=" + venueNumber +
                '}';
    }
}
