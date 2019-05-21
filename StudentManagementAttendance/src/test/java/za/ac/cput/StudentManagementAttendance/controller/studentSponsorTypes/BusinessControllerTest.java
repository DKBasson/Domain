package za.ac.cput.StudentManagementAttendance.controller.studentSponsorTypes;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory.BusinessFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BusinessControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Business";

    @Test
    public void testGetAllBusinesss() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetBusinessById() {
        Business student = restTemplate.getForObject(baseURL + "/student/1", Business.class);
        System.out.println(student.getsName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateBusiness() {
        Business student = BusinessFactory.getBusiness("John"," Doh", "216183006");

        ResponseEntity<Business> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Business.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateBusiness() {
        int id = 1;
        Business student = restTemplate.getForObject(baseURL + "/student/" + id, Business.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Business updatedBusiness = restTemplate.getForObject(baseURL + "/Business/" + id, Business.class);
        assertNotNull(updatedBusiness);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Business student = restTemplate.getForObject(baseURL + "/students/" + id, Business.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Business.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

