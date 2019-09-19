package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Attendance;

public class AttendanceFactoryTest {

    @Test
    public void getAttendance() {

        Attendance attendance = AttendanceFactory.getAttendance( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(attendance);
    }
}