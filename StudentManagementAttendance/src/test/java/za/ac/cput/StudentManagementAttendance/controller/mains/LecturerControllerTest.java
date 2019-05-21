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
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.LecturerFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class LecturerControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/lecturer";

    @Test
    public void testGetAllLecturers() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetLecturerById() {
        Lecturer student = restTemplate.getForObject(baseURL + "/student/1", Lecturer.class);
        System.out.println(student.getLecturerName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateLecturer() {
        Lecturer student = LecturerFactory.getLecturer("testSurname", "testSurename", "216183006");

        ResponseEntity<Lecturer> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Lecturer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateLecturer() {
        int id = 1;
        Lecturer student = restTemplate.getForObject(baseURL + "/student/" + id, Lecturer.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Lecturer updatedLecturer = restTemplate.getForObject(baseURL + "/Lecturer/" + id, Lecturer.class);
        assertNotNull(updatedLecturer);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Lecturer student = restTemplate.getForObject(baseURL + "/students/" + id, Lecturer.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Lecturer.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

