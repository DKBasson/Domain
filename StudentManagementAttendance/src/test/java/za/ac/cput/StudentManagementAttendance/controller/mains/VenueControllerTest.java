package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.VenueFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class VenueControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Venue";

    @Test
    public void testGetAllVenues() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetVenueById() {
        Venue student = restTemplate.getForObject(baseURL + "/student/1", Venue.class);
        System.out.println(student.getVenueNumber());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateVenue() {
        Venue student = VenueFactory.getVenue("216183006");

        ResponseEntity<Venue> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Venue.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateVenue() {
        int id = 1;
        Venue student = restTemplate.getForObject(baseURL + "/student/" + id, Venue.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Venue updatedVenue = restTemplate.getForObject(baseURL + "/Venue/" + id, Venue.class);
        assertNotNull(updatedVenue);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Venue student = restTemplate.getForObject(baseURL + "/students/" + id, Venue.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Venue.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

