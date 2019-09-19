package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Venue;

public class VenueFactoryTest {

    @Test
    public void getVenue() {

        Venue venue = VenueFactory.getVenue( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(venue);
    }
}