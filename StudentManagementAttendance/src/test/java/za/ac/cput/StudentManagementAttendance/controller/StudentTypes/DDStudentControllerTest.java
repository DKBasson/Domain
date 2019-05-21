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
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory.StudentTypesFactory.DDStudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DDStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/DDStudent";

    @Test
    public void testGetAllDDStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetDDStudentById() {
        DDStudent student = restTemplate.getForObject(baseURL + "/student/1", DDStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateDDStudent() {
        DDStudent student = DDStudentFactory.getDDStudent("John"," Doh","06/03/1045", "216183006", 10);

        ResponseEntity<DDStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, DDStudent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateDDStudent() {
        int id = 1;
        DDStudent student = restTemplate.getForObject(baseURL + "/student/" + id, DDStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        DDStudent updatedDDStudent = restTemplate.getForObject(baseURL + "/DDStudent/" + id, DDStudent.class);
        assertNotNull(updatedDDStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        DDStudent student = restTemplate.getForObject(baseURL + "/students/" + id, DDStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, DDStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

