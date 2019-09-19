package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.HOD;

public class HODFactoryTest {

    @Test
    public void getHOD() {

        HOD hod = HODFactory.getHOD( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(hod);
    }
}