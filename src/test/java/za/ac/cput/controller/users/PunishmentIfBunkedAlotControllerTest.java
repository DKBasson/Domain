package za.ac.cput.controller.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.factory.users.PunishmentIfBunkedAlotFactory;

public class PunishmentIfBunkedAlotControllerTest {

    @Test
    public void getPunishmentIfBunkedAlot() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(punishmentIfBunkedAlot);
    }
}