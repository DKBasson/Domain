package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PersonFactory;

public class PersonFactoryTest {
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
    public void buildPerson() {
        Person course = PersonFactory.getPerson(this.testName, this.testSurname);
        Assert.assertNotNull(course.getPersonName());
        Assert.assertNotNull(course);
    }
}