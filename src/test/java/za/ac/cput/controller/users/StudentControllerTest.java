package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Student;
import za.ac.cput.factory.users.StudentFactory;

public class StudentControllerTest {

    @Test
    public void getStudent() {

        Student student = StudentFactory.getStudent( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(student);
    }
}