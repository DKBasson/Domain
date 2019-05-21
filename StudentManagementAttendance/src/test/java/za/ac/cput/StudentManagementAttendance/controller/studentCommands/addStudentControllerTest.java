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
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class addStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/addStudent";

    @Test
    public void testGetAlladdStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetaddStudentById() {
        addStudent student = restTemplate.getForObject(baseURL + "/student/1", addStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateaddStudent() {
//        addStudent student = addStudentFactory.getaddStudent("testSurname", "testSurename");

//        ResponseEntity<addStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, addStudent.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateaddStudent() {
        int id = 1;
        addStudent student = restTemplate.getForObject(baseURL + "/student/" + id, addStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        addStudent updatedaddStudent = restTemplate.getForObject(baseURL + "/addStudent/" + id, addStudent.class);
        assertNotNull(updatedaddStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        addStudent student = restTemplate.getForObject(baseURL + "/students/" + id, addStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, addStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

