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
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentPunishmentTypesFactory.StudentTypesFactory.ADStudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ADStudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/ADStudent";

    @Test
    public void testGetAllADStudents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetADStudentById() {
        ADStudent student = restTemplate.getForObject(baseURL + "/student/1", ADStudent.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateADStudent() {
        ADStudent student = ADStudentFactory.getADStudent("John"," Doh","06/03/1045", "216183006", 10);

        ResponseEntity<ADStudent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, ADStudent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateADStudent() {
        int id = 1;
        ADStudent student = restTemplate.getForObject(baseURL + "/student/" + id, ADStudent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        ADStudent updatedADStudent = restTemplate.getForObject(baseURL + "/ADStudent/" + id, ADStudent.class);
        assertNotNull(updatedADStudent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        ADStudent student = restTemplate.getForObject(baseURL + "/students/" + id, ADStudent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, ADStudent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

