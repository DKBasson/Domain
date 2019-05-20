package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.StudentFactory;


public class StudentFactoryTest {
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
    public void buildStudent() {
        Student course = StudentFactory.getStudent(this.testName, this.testSurname, this.testDate, this.testID, this.daysMissed);
        Assert.assertNotNull(course.getSsStudentNum());
        Assert.assertNotNull(course);
    }
}
