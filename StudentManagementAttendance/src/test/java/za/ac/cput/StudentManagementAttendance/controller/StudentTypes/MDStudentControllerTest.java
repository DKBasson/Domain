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
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory.StudentTypesFactory.MDStudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class MDStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/MDStudent";

    @Test
    public void testGetAllMDStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetMDStudentById() {
        MDStudent student = restTemplate.getForObject(baseURL + "/student/1", MDStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateMDStudent() {
        MDStudent student = MDStudentFactory.getMDStudent("John"," Doh","06/03/1045", "216183006", 10);

        ResponseEntity<MDStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, MDStudent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateMDStudent() {
        int id = 1;
        MDStudent student = restTemplate.getForObject(baseURL + "/student/" + id, MDStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        MDStudent updatedMDStudent = restTemplate.getForObject(baseURL + "/MDStudent/" + id, MDStudent.class);
        assertNotNull(updatedMDStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        MDStudent student = restTemplate.getForObject(baseURL + "/students/" + id, MDStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, MDStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

