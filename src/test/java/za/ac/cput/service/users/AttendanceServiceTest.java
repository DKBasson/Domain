package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.factory.users.AttendanceFactory;
import za.ac.cput.service.users.impl.AttendanceServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttendanceServiceTest {

    @Autowired
    private AttendanceServiceImpl attendanceService;
    Attendance attendance = AttendanceFactory.getAttendance("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        attendanceService.create(attendance);

        assertNotNull(attendanceService.getAll());
        System.out.println(attendanceService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(attendanceService.getAll());

        Attendance attendance1 = attendanceService.read(attendance.getUserID());

        assertEquals(attendance, attendance1);
        System.out.println(attendanceService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(attendanceService.getAll());

        Attendance attendance1 = AttendanceFactory.getAttendance("TestID", "TestName2", "TestLastName", "TestEmail");
        attendance1.setUserID(attendance.getUserID());
        attendanceService.update(attendance1);

        Attendance attendance2 = attendanceService.read(attendance1.getUserID());

        assertEquals(attendance1, attendance2);
        System.out.println(attendanceService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(attendanceService.getAll());

        attendanceService.delete(attendance.getUserID());

        Attendance notInSet = attendanceService.read(attendance.getUserID());

        assertNull(notInSet);
        System.out.println(attendanceService.getAll());





    }
}