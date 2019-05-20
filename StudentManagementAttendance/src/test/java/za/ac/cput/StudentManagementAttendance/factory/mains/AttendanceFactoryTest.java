package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AttendanceFactory;

public class AttendanceFactoryTest {

    private String testID;
    private int testDaysMissed;

    @Before
    public void setUp() throws Exception {

        this.testID = "216183006";
        this.testDaysMissed = 6;}

    @Test
    public void buildAttendance() {
        Attendance course = AttendanceFactory.getAttendance(this.testID, this.testDaysMissed);
        Assert.assertNotNull(course.getStudentID());
        Assert.assertNotNull(course);
    }
}
