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
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.HODFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class HODControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/hod";

    @Test
    public void testGetAllHODs() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetHODById() {
        HOD student = restTemplate.getForObject(baseURL + "/student/1", HOD.class);
        System.out.println(student.getMemberName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateHOD() {
        HOD student = HODFactory.getHOD("testSurname", "testSurename", "216183006");

        ResponseEntity<HOD> postResponse = restTemplate.postForEntity(baseURL + "/create", student, HOD.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateHOD() {
        int id = 1;
        HOD student = restTemplate.getForObject(baseURL + "/student/" + id, HOD.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        HOD updatedHOD = restTemplate.getForObject(baseURL + "/HOD/" + id, HOD.class);
        assertNotNull(updatedHOD);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        HOD student = restTemplate.getForObject(baseURL + "/students/" + id, HOD.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, HOD.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

