package za.ac.cput.StudentManagementAttendance.factory.mainsFactory;

import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;

public class VenueFactory {
    public static Venue getVenue(String venueNumber) {
        return new Venue.Builder().venueNumber(venueNumber).build();
    }
}
