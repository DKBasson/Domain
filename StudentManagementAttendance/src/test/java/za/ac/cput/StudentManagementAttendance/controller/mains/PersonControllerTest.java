package za.ac.cput.StudentManagementAttendance.controller.mains;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PersonFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class PersonControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/person";

    @Test
    public void testGetAllPersons() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetPersonById() {
        Person student = restTemplate.getForObject(baseURL + "/student/1", Person.class);
        System.out.println(student.getPersonName());
        assertNotNull(student);
    }

    @Ignore
    public void testCreatePerson() {
        Person student = PersonFactory.getPerson("testName", "testSurename");

        ResponseEntity<Person> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Person.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdatePerson() {
        int id = 1;
        Person student = restTemplate.getForObject(baseURL + "/student/" + id, Person.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Person updatedPerson = restTemplate.getForObject(baseURL + "/Person/" + id, Person.class);
        assertNotNull(updatedPerson);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Person student = restTemplate.getForObject(baseURL + "/students/" + id, Person.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Person.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

