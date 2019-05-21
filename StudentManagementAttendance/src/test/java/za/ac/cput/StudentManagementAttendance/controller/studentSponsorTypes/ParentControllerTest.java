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
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.factory.studentSponsorTypesFactory.ParentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ParentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Parent";

    @Test
    public void testGetAllParents() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetParentById() {
        Parent student = restTemplate.getForObject(baseURL + "/student/1", Parent.class);
        System.out.println(student.getSponsorNum());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateParent() {
        Parent student = ParentFactory.getParent("John"," Doh", "216183006");

        ResponseEntity<Parent> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Parent.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateParent() {
        int id = 1;
        Parent student = restTemplate.getForObject(baseURL + "/student/" + id, Parent.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Parent updatedParent = restTemplate.getForObject(baseURL + "/Parent/" + id, Parent.class);
        assertNotNull(updatedParent);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Parent student = restTemplate.getForObject(baseURL + "/students/" + id, Parent.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Parent.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

