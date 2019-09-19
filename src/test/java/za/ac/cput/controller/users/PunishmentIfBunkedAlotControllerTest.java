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
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.factory.users.PunishmentIfBunkedAlotFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PunishmentIfBunkedAlotControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/punishmentIfBunkedAlot";

    @Test
    public void a_create() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot("216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        punishmentIfBunkedAlot.setUserID("216183006");
        ResponseEntity<PunishmentIfBunkedAlot> postResponse = restTemplate.postForEntity(baseURL + "/new", punishmentIfBunkedAlot, PunishmentIfBunkedAlot.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/find/" + "216183006", PunishmentIfBunkedAlot.class);
        assertNotNull(punishmentIfBunkedAlot);
        System.out.println(punishmentIfBunkedAlot.getFirstName());

    }

    @Test
    public void c_update() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/find/" + "216183006", PunishmentIfBunkedAlot.class);
        punishmentIfBunkedAlot.setFirstName("Derek");
        restTemplate.put(baseURL + "/update/" + "216183006", punishmentIfBunkedAlot);
        PunishmentIfBunkedAlot updatedPunishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/update/" + "216183006", PunishmentIfBunkedAlot.class);
        assertNotNull(punishmentIfBunkedAlot);
        System.out.println(punishmentIfBunkedAlot);

    }

    @Test
    public void e_delete() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/find/" + "216183006", PunishmentIfBunkedAlot.class);
        assertNotNull(punishmentIfBunkedAlot);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            punishmentIfBunkedAlot = restTemplate.getForObject(baseURL + "/find/" + "216183006", PunishmentIfBunkedAlot.class);
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