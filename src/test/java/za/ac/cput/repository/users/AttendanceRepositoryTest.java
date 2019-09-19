package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.factory.users.AttendanceFactory;
import za.ac.cput.repository.users.impl.AttendanceRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttendanceRepositoryTest {

    @Autowired
    private AttendanceRepositoryImpl attendanceRepository;
    Attendance attendance = AttendanceFactory.getAttendance("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        attendanceRepository.create(attendance);
        assertNotNull(attendanceRepository.getAll());
        System.out.println(attendanceRepository.getAll());

    }

    @Test
    public void b_read() {

        Attendance fromSet = attendanceRepository.read(attendance.getUserID());
        assertEquals(attendance, fromSet);
        System.out.println(attendanceRepository.getAll());
    }

    @Test
    public void c_update() {


        Attendance updatedAttendance  = AttendanceFactory.getAttendance("TestID", "TestName2", "TestLastName", "TestEmail");
        attendanceRepository.update(updatedAttendance);
        Assert.assertNotEquals(attendance.getFirstName(), updatedAttendance.getFirstName());
        System.out.println(attendanceRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(attendanceRepository.getAll());
        attendanceRepository.delete(attendance.getUserID());
        Attendance attendanceTor = attendanceRepository.read(attendance.getUserID());
        assertNull(attendanceTor);
        System.out.println(attendanceRepository.getAll());

    }
}