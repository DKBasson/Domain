package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.HODFactory;

public class HODFactoryTest {
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
    public void buildHOD() {
        HOD course = HODFactory.getHOD(this.testName, this.testSurname, this.testID);
        Assert.assertNotNull(course.getMemberID());
        Assert.assertNotNull(course);
    }
}