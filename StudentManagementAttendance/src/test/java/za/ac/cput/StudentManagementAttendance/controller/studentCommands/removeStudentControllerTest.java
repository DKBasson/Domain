package za.ac.cput.StudentManagementAttendance.controller.studentCommands;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.factory.studentCommandsFactory.removeStudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class removeStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/removeStudent";

    @Test
    public void testGetAllremoveStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetremoveStudentById() {
        removeStudent student = restTemplate.getForObject(baseURL + "/student/1", removeStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateremoveStudent() {
        removeStudent student = removeStudentFactory.getRemoveStudent("John"," Doh","06/03/1045", "216183006", 10);

        ResponseEntity<removeStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, removeStudent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateremoveStudent() {
        int id = 1;
        removeStudent student = restTemplate.getForObject(baseURL + "/student/" + id, removeStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        removeStudent updatedremoveStudent = restTemplate.getForObject(baseURL + "/removeStudent/" + id, removeStudent.class);
        assertNotNull(updatedremoveStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        removeStudent student = restTemplate.getForObject(baseURL + "/students/" + id, removeStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, removeStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

