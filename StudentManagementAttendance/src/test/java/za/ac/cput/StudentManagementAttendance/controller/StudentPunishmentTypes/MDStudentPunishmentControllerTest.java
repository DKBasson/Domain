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
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.MDStudentPunishmentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class MDStudentPunishmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/MDStudentPunishment";

    @Test
    public void testGetAllMDStudentPunishments() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetMDStudentPunishmentById() {
        MDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/1", MDStudentPunishment.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateMDStudentPunishment() {
//        MDStudentPunishment student = MDStudentPunishmentFactory.getADStudent("John"," Doh","06/03/1045", "216183006", 10);

//        ResponseEntity<MDStudentPunishment> postResponse = restTemplate.postForEntity(baseURL + "/create", student, MDStudentPunishment.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateMDStudentPunishment() {
        int id = 1;
        MDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/" + id, MDStudentPunishment.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        MDStudentPunishment updatedMDStudentPunishment = restTemplate.getForObject(baseURL + "/MDStudentPunishment/" + id, MDStudentPunishment.class);
        assertNotNull(updatedMDStudentPunishment);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        MDStudentPunishment student = restTemplate.getForObject(baseURL + "/students/" + id, MDStudentPunishment.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, MDStudentPunishment.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

