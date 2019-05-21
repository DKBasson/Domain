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
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AttendanceFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AttendanceControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/attendance";

    @Test
    public void testGetAllAttendances() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetAttendanceById() {
        Attendance student = restTemplate.getForObject(baseURL + "/student/1", Attendance.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateAttendance() {
        Attendance student = AttendanceFactory.getAttendance("16183006", 95);

        ResponseEntity<Attendance> postResponse = restTemplate.postForEntity(baseURL + "/create", student, Attendance.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateAttendance() {
        int id = 1;
        Attendance student = restTemplate.getForObject(baseURL + "/student/" + id, Attendance.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        Attendance updatedAttendance = restTemplate.getForObject(baseURL + "/Attendance/" + id, Attendance.class);
        assertNotNull(updatedAttendance);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        Attendance student = restTemplate.getForObject(baseURL + "/students/" + id, Attendance.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, Attendance.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}

