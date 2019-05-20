package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.LecturerFactory;

public class LecturerFactoryTest {
    private String testName;
    private String testSurname;
    private String testID;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
        this.testSurname = "testName";
        this.testID = "216183006";
    }

    @Test
    public void buildLecturer() {
        Lecturer course = LecturerFactory.getLecturer(this.testName, this.testSurname, this.testID);
        Assert.assertNotNull(course.getStaffID());
        Assert.assertNotNull(course);
    }
}