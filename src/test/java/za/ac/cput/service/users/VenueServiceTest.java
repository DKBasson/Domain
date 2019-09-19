package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.factory.users.VenueFactory;
import za.ac.cput.service.users.impl.VenueServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VenueServiceTest {

    @Autowired
    private VenueServiceImpl venueService;
    Venue venue = VenueFactory.getVenue("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        venueService.create(venue);

        assertNotNull(venueService.getAll());
        System.out.println(venueService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(venueService.getAll());

        Venue venue1 = venueService.read(venue.getVenueID());

        assertEquals(venue, venue1);
        System.out.println(venueService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(venueService.getAll());

        Venue venue1 = VenueFactory.getVenue("TestID", "TestName2", "TestLastName", "TestEmail");
        venue1.setVenueID(venue.getVenueID());
        venueService.update(venue1);

        Venue venue2 = venueService.read(venue1.getVenueID());

        assertEquals(venue1, venue2);
        System.out.println(venueService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(venueService.getAll());

        venueService.delete(venue.getVenueID());

        Venue notInSet = venueService.read(venue.getVenueID());

        assertNull(notInSet);
        System.out.println(venueService.getAll());





    }
}