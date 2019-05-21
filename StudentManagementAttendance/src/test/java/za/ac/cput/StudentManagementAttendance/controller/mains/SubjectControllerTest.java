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
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.SubjectFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class SubjectControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Subject";

    @Test
    public void testGetAllSubjects() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetSubjectById() {
        Subject student = restTemplate.getForObject(baseURL + "/student/1", Subject.class);
        System.out.println(student.getSubjectName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateSubject() {
        Subject student = SubjectFactory.getSubject("testSurname", "testSurename");

        ResponseEntity<Subject> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Subject.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateSubject() {
        int id = 1;
        Subject student = restTemplate.getForObject(baseURL + "/student/" + id, Subject.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Subject updatedSubject = restTemplate.getForObject(baseURL + "/Subject/" + id, Subject.class);
        assertNotNull(updatedSubject);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Subject student = restTemplate.getForObject(baseURL + "/students/" + id, Subject.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Subject.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

