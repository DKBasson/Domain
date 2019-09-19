package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.factory.users.VenueFactory;
import za.ac.cput.repository.users.impl.VenueRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VenueRepositoryTest {

    @Autowired
    private VenueRepositoryImpl venueRepository;
    Venue venue = VenueFactory.getVenue("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        venueRepository.create(venue);
        assertNotNull(venueRepository.getAll());
        System.out.println(venueRepository.getAll());

    }

    @Test
    public void b_read() {

        Venue fromSet = venueRepository.read(venue.getVenueID());
        assertEquals(venue, fromSet);
        System.out.println(venueRepository.getAll());
    }

    @Test
    public void c_update() {


        Venue updatedVenue  = VenueFactory.getVenue("TestID", "TestName2", "TestLastName", "TestEmail");
        venueRepository.update(updatedVenue);
        Assert.assertNotEquals(venue.getVenueName(), updatedVenue.getVenueName());
        System.out.println(venueRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(venueRepository.getAll());
        venueRepository.delete(venue.getVenueID());
        Venue venueTor = venueRepository.read(venue.getVenueID());
        assertNull(venueTor);
        System.out.println(venueRepository.getAll());

    }
}