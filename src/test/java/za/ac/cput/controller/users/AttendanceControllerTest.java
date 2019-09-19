package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Attendance;
import za.ac.cput.factory.users.AttendanceFactory;

public class AttendanceControllerTest {

    @Test
    public void getAttendance() {

        Attendance attendance = AttendanceFactory.getAttendance( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(attendance);
    }
}