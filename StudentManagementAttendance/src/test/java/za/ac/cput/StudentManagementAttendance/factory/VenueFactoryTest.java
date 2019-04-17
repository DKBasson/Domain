package za.ac.cput.StudentManagementAttendance.factory;

import za.ac.cput.StudentManagementAttendance.domain.Venue;

public class VenueFactoryTest {
    public static Venue getVenue(int venueNumber) {
        return new Venue.Builder().venueNumber(venueNumber).build();
    }
}
