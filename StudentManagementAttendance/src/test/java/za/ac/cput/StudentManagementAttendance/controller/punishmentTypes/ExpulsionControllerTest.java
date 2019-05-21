package za.ac.cput.StudentManagementAttendance.controller.punishmentTypes;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.factory.punishmentTypesFactory.ExpulsionFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ExpulsionControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Expulsion";

    @Test
    public void testGetAllExpulsions() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetExpulsionById() {
        Expulsion student = restTemplate.getForObject(baseURL + "/student/1", Expulsion.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateExpulsion() {
        Expulsion student = ExpulsionFactory.getExpulsion("testSurname", "testSurename");

        ResponseEntity<Expulsion> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Expulsion.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateExpulsion() {
        int id = 1;
        Expulsion student = restTemplate.getForObject(baseURL + "/student/" + id, Expulsion.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Expulsion updatedExpulsion = restTemplate.getForObject(baseURL + "/Expulsion/" + id, Expulsion.class);
        assertNotNull(updatedExpulsion);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Expulsion student = restTemplate.getForObject(baseURL + "/students/" + id, Expulsion.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Expulsion.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

