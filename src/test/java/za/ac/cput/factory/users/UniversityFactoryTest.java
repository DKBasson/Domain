package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.University;

public class UniversityFactoryTest {

    @Test
    public void getUniversity() {

        University university = UniversityFactory.getUniversity( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(university);
    }
}