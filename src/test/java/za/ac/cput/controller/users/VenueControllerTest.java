package za.ac.cput.controller.users;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.domain.users.Venue;
import za.ac.cput.factory.users.VenueFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VenueControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/venue";

    @Test
    public void a_create() {

        Venue venue = VenueFactory.getVenue("216183006", "12564", "Large", "Too High");
        venue.setVenueID("216183006");
        ResponseEntity<Venue> postResponse = restTemplate.postForEntity(baseURL + "/new", venue, Venue.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Venue venue = restTemplate.getForObject(baseURL + "/find/" + "216183006", Venue.class);
        assertNotNull(venue);
        System.out.println(venue.getVenueName());

    }

    @Test
    public void c_update() {

        Venue venue = restTemplate.getForObject(baseURL + "/find/" + "216183006", Venue.class);
        venue.setVenueName("Advanced");
        restTemplate.put(baseURL + "/update/" + "216183006", venue);
        Venue updatedVenue = restTemplate.getForObject(baseURL + "/update/" + "216183006", Venue.class);
        assertNotNull(venue);
        System.out.println(venue);

    }

    @Test
    public void e_delete() {

        Venue venue = restTemplate.getForObject(baseURL + "/find/" + "216183006", Venue.class);
        assertNotNull(venue);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            venue = restTemplate.getForObject(baseURL + "/find/" + "216183006", Venue.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());

    }


}