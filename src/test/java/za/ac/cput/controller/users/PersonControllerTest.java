package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Person;
import za.ac.cput.factory.users.PersonFactory;

public class PersonControllerTest {

    @Test
    public void getPerson() {

        Person person = PersonFactory.getPerson( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(person);
    }
}