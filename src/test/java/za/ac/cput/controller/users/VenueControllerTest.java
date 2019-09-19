package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.factory.users.VenueFactory;

public class VenueControllerTest {

    @Test
    public void getVenue() {

        Venue venue = VenueFactory.getVenue( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(venue);
    }
}