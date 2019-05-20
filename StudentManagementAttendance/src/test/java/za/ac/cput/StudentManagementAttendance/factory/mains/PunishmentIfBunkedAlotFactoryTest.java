package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PunishmentIfBunkedAlotFactory;

public class PunishmentIfBunkedAlotFactoryTest {
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
    public void buildPunishment() {
        PunishmentIfBunkedAlot course = PunishmentIfBunkedAlotFactory.getPunishment(this.testName, this.testID);
        Assert.assertNotNull(course.getStudentID());
        Assert.assertNotNull(course);
    }
}