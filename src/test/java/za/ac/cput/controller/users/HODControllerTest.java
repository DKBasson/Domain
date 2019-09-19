package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.factory.users.HODFactory;

public class HODControllerTest {

    @Test
    public void getHOD() {

        HOD hod = HODFactory.getHOD( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(hod);
    }
}