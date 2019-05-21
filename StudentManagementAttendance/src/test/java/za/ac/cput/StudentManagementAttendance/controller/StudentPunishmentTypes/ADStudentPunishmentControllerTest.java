package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.ADStudentPunishmentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ADStudentPunishmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/ADStudentPunishment";

    @Test
    public void testGetAllADStudentPunishments() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetADStudentPunishmentById() {
        ADStudentPunishment student = restTemplate.getForObject(baseURL + "/student/1", ADStudentPunishment.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateADStudentPunishment() {
//        ADStudentPunishment student = ADStudentPunishmentFactory.getADStudent("John"," Doh","06/03/1045", "216183006", 10);

//        ResponseEntity<ADStudentPunishment> postResponse = restTemplate.postForEntity(baseURL + "/create", student, ADStudentPunishment.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateADStudentPunishment() {
        int id = 1;
        ADStudentPunishment student = restTemplate.getForObject(baseURL + "/student/" + id, ADStudentPunishment.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        ADStudentPunishment updatedADStudentPunishment = restTemplate.getForObject(baseURL + "/ADStudentPunishment/" + id, ADStudentPunishment.class);
        assertNotNull(updatedADStudentPunishment);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        ADStudentPunishment student = restTemplate.getForObject(baseURL + "/students/" + id, ADStudentPunishment.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, ADStudentPunishment.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

