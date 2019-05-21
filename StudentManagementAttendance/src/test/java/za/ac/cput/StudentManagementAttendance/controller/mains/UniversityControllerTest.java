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
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.UniversityFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class UniversityControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/University";

    @Test
    public void testGetAllUniversitys() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetUniversityById() {
        University student = restTemplate.getForObject(baseURL + "/student/1", University.class);
        System.out.println(student.getUniversityName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateUniversity() {
        University student = UniversityFactory.getUniversity("testSurname", "testSurename", "216183006");

        ResponseEntity<University> postResponse = restTemplate.postForEntity(baseURL + "/create", student, University.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateUniversity() {
        int id = 1;
        University student = restTemplate.getForObject(baseURL + "/student/" + id, University.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        University updatedUniversity = restTemplate.getForObject(baseURL + "/University/" + id, University.class);
        assertNotNull(updatedUniversity);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        University student = restTemplate.getForObject(baseURL + "/students/" + id, University.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, University.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

