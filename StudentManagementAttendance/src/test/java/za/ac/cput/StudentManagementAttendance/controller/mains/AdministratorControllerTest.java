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
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AdministratorFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AdministratorControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/administrator";

    @Test
    public void testGetAllAdministrators() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetAdministratorById() {
        Administrator student = restTemplate.getForObject(baseURL + "/student/1", Administrator.class);
        System.out.println(student.getAdministratorNameName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateAdministrator() {
        Administrator student = AdministratorFactory.getAdministrator("John"," Doh", "216183006");

        ResponseEntity<Administrator> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Administrator.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateAdministrator() {
        int id = 1;
        Administrator student = restTemplate.getForObject(baseURL + "/student/" + id, Administrator.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Administrator updatedAdministrator = restTemplate.getForObject(baseURL + "/Administrator/" + id, Administrator.class);
        assertNotNull(updatedAdministrator);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Administrator student = restTemplate.getForObject(baseURL + "/students/" + id, Administrator.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Administrator.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

