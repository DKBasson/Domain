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
import za.ac.cput.domain.users.HOD;
import za.ac.cput.factory.users.HODFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HODControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/hod";

    @Test
    public void a_create() {

        HOD hod = HODFactory.getHOD("216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        hod.setUserID("216183006");
        ResponseEntity<HOD> postResponse = restTemplate.postForEntity(baseURL + "/new", hod, HOD.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        HOD hod = restTemplate.getForObject(baseURL + "/find/" + "216183006", HOD.class);
        assertNotNull(hod);
        System.out.println(hod.getFirstName());

    }

    @Test
    public void c_update() {

        HOD hod = restTemplate.getForObject(baseURL + "/find/" + "216183006", HOD.class);
        hod.setFirstName("Derek");
        restTemplate.put(baseURL + "/update/" + "216183006", hod);
        HOD updatedHOD = restTemplate.getForObject(baseURL + "/update/" + "216183006", HOD.class);
        assertNotNull(hod);
        System.out.println(hod);

    }

    @Test
    public void e_delete() {

        HOD hod = restTemplate.getForObject(baseURL + "/find/" + "216183006", HOD.class);
        assertNotNull(hod);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            hod = restTemplate.getForObject(baseURL + "/find/" + "216183006", HOD.class);
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