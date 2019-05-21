package za.ac.cput.StudentManagementAttendance.controller.StudentTypes;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory.StudentTypesFactory.BDStudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BDStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/BDStudent";

    @Test
    public void testGetAllBDStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetBDStudentById() {
        BDStudent student = restTemplate.getForObject(baseURL + "/student/1", BDStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateBDStudent() {
        BDStudent student = BDStudentFactory.getBDStudent("John"," Doh","06/03/1045", "216183006", 10);

        ResponseEntity<BDStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, BDStudent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateBDStudent() {
        int id = 1;
        BDStudent student = restTemplate.getForObject(baseURL + "/student/" + id, BDStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        BDStudent updatedBDStudent = restTemplate.getForObject(baseURL + "/BDStudent/" + id, BDStudent.class);
        assertNotNull(updatedBDStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        BDStudent student = restTemplate.getForObject(baseURL + "/students/" + id, BDStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, BDStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

