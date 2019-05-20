package za.ac.cput.StudentManagementAttendance.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.Student;

public class StudentFactoryTest {

    @Test
    public void testGetStudent() throws Exception {
        String name = "Deklerk";
        String surname = "Basson";
        String datesNotAttended = "#2019-04-15#";
        String studentNumber = "216183006";
        int numNotAttended = 1;

        Student c = StudentFactory.getStudent(name, surname, datesNotAttended, studentNumber, numNotAttended);
        System.out.println(c);
        Assert.assertNotNull(c.getsName());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme