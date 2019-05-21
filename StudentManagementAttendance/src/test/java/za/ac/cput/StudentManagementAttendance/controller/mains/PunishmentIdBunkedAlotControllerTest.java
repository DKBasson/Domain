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
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PunishmentIfBunkedAlotFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class PunishmentIdBunkedAlotControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/PunishmentIfBunkedAlot";

    @Test
    public void testGetAllPunishmentIfBunkedAlots() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetPunishmentIfBunkedAlotById() {
        PunishmentIfBunkedAlot student = restTemplate.getForObject(baseURL + "/student/1", PunishmentIfBunkedAlot.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreatePunishmentIfBunkedAlot() {
        PunishmentIfBunkedAlot student = PunishmentIfBunkedAlotFactory.getPunishment("13431", "12435");

        ResponseEntity<PunishmentIfBunkedAlot> postResponse = restTemplate.postForEntity(baseURL + "/create", student, PunishmentIfBunkedAlot.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdatePunishmentIfBunkedAlot() {
        int id = 1;
        PunishmentIfBunkedAlot student = restTemplate.getForObject(baseURL + "/student/" + id, PunishmentIfBunkedAlot.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        PunishmentIfBunkedAlot updatedPunishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/PunishmentIfBunkedAlot/" + id, PunishmentIfBunkedAlot.class);
        assertNotNull(updatedPunishmentIfBunkedAlot);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        PunishmentIfBunkedAlot student = restTemplate.getForObject(baseURL + "/students/" + id, PunishmentIfBunkedAlot.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, PunishmentIfBunkedAlot.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

