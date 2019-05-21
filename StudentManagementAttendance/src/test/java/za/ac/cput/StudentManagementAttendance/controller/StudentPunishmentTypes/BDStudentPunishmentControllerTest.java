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
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.BDStudentPunishmentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BDStudentPunishmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/BDStudentPunishment";

    @Test
    public void testGetAllBDStudentPunishments() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetBDStudentPunishmentById() {
        BDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/1", BDStudentPunishment.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateBDStudentPunishment() {
//        BDStudentPunishment student = BDStudentPunishmentFactory.getADStudent("John"," Doh","06/03/1045", "216183006", 10);

//        ResponseEntity<BDStudentPunishment> postResponse = restTemplate.postForEntity(baseURL + "/create", student, BDStudentPunishment.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateBDStudentPunishment() {
        int id = 1;
        BDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/" + id, BDStudentPunishment.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        BDStudentPunishment updatedBDStudentPunishment = restTemplate.getForObject(baseURL + "/BDStudentPunishment/" + id, BDStudentPunishment.class);
        assertNotNull(updatedBDStudentPunishment);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        BDStudentPunishment student = restTemplate.getForObject(baseURL + "/students/" + id, BDStudentPunishment.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, BDStudentPunishment.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

