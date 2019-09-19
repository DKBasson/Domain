package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Venue;

public class VenueFactory {
    public static Venue getVenue(String venueID, String venueName, String venueDisc, String venueLevel) {
        return new Venue.Builder().venueID(venueID).venueName(venueName).venueDisc(venueDisc).venueLevel(venueLevel).build();
    }
}


