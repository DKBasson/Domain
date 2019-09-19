package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.University;
import za.ac.cput.factory.users.UniversityFactory;

public class UniversityControllerTest {

    @Test
    public void getUniversity() {

        University university = UniversityFactory.getUniversity( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(university);
    }
}