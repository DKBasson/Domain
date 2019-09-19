package za.ac.cput.controller.users;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.domain.users.University;
import za.ac.cput.factory.users.UniversityFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UniversityControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/university";

    @Test
    public void a_create() {

        University university = UniversityFactory.getUniversity("216183006", "CPUT", "Boring", "Too High");
        university.setUniversityID("216183006");
        ResponseEntity<University> postResponse = restTemplate.postForEntity(baseURL + "/new", university, University.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        University university = restTemplate.getForObject(baseURL + "/find/" + "216183006", University.class);
        assertNotNull(university);
        System.out.println(university.getUniversityName());

    }

    @Test
    public void c_update() {

        University university = restTemplate.getForObject(baseURL + "/find/" + "216183006", University.class);
        university.setUniversityName("Advanced");
        restTemplate.put(baseURL + "/update/" + "216183006", university);
        University updatedUniversity = restTemplate.getForObject(baseURL + "/update/" + "216183006", University.class);
        assertNotNull(university);
        System.out.println(university);

    }

    @Test
    public void e_delete() {

        University university = restTemplate.getForObject(baseURL + "/find/" + "216183006", University.class);
        assertNotNull(university);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            university = restTemplate.getForObject(baseURL + "/find/" + "216183006", University.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
    }


}