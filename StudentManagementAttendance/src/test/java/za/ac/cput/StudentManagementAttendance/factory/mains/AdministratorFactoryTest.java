package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AdministratorFactory;

public class AdministratorFactoryTest {
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
    public void buildAdministrator() {
        Administrator course = AdministratorFactory.getAdministrator(this.testName, this.testSurname, this.testID);
        Assert.assertNotNull(course.getStaffID());
        Assert.assertNotNull(course);
    }
}