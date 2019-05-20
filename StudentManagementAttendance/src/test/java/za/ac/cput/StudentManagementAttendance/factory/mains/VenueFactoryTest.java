package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.VenueFactory;

public class VenueFactoryTest {
    private String testName;
    private String testSurname;
    private String testDate;
    private String testID;
    private int daysMissed;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
        this.testSurname = "testName";
        this.testDate = "03/04/2015";
        this.testID = "216183006";
        this.daysMissed = 65;
    }

    @Test
    public void buildPunishment() {
        Venue course = VenueFactory.getVenue(this.testID);
        Assert.assertNotNull(course.getVenueNumber());
        Assert.assertNotNull(course);
    }
}
