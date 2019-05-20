package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.StudentSponsorFactory;

public class StudentSponsorTest {
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
    public void buildStudentSponsor() {
        StudentSponsor course = StudentSponsorFactory.getStudentSponsor(this.testName, this.testSurname, this.testID);
        Assert.assertNotNull(course.getSponsorNum());
        Assert.assertNotNull(course);
    }
}
