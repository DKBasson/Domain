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
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.factory.users.AttendanceFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttendanceControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/attendance";

    @Test
    public void a_create() {

        Attendance attendance = AttendanceFactory.getAttendance("216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        attendance.setUserID("216183006");
        ResponseEntity<Attendance> postResponse = restTemplate.postForEntity(baseURL + "/new", attendance, Attendance.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Attendance attendance = restTemplate.getForObject(baseURL + "/find/" + "216183006", Attendance.class);
        assertNotNull(attendance);
        System.out.println(attendance.getFirstName());

    }

    @Test
    public void c_update() {

        Attendance attendance = restTemplate.getForObject(baseURL + "/find/" + "216183006", Attendance.class);
        attendance.setFirstName("Derek");
        restTemplate.put(baseURL + "/update/" + "216183006", attendance);
        Attendance updatedAttendance = restTemplate.getForObject(baseURL + "/update/" + "216183006", Attendance.class);
        assertNotNull(attendance);
        System.out.println(attendance);

    }

    @Test
    public void e_delete() {

        Attendance attendance = restTemplate.getForObject(baseURL + "/find/" + "216183006", Attendance.class);
        assertNotNull(attendance);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            attendance = restTemplate.getForObject(baseURL + "/find/" + "216183006", Attendance.class);
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