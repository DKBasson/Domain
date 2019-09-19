package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;

public class PunishmentIfBunkedAlotFactoryTest {

    @Test
    public void getPunishmentIfBunkedAlot() {

        PunishmentIfBunkedAlot punishmentIfBunkedAlot = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(punishmentIfBunkedAlot);
    }
}