package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.factory.users.LecturerFactory;

public class LecturerControllerTest {

    @Test
    public void getLecturer() {

        Lecturer lecturer = LecturerFactory.getLecturer( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(lecturer);
    }
}