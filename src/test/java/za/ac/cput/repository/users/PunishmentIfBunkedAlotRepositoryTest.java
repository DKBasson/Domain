package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.factory.users.PunishmentIfBunkedAlotFactory;
import za.ac.cput.repository.users.impl.PunishmentIfBunkedAlotRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PunishmentIfBunkedAlotRepositoryTest {

    @Autowired
    private PunishmentIfBunkedAlotRepositoryImpl punishmentIfBunkedAlotRepository;
    PunishmentIfBunkedAlot punishmentIfBunkedAlot = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        punishmentIfBunkedAlotRepository.create(punishmentIfBunkedAlot);
        assertNotNull(punishmentIfBunkedAlotRepository.getAll());
        System.out.println(punishmentIfBunkedAlotRepository.getAll());

    }

    @Test
    public void b_read() {

        PunishmentIfBunkedAlot fromSet = punishmentIfBunkedAlotRepository.read(punishmentIfBunkedAlot.getUserID());
        assertEquals(punishmentIfBunkedAlot, fromSet);
        System.out.println(punishmentIfBunkedAlotRepository.getAll());
    }

    @Test
    public void c_update() {


        PunishmentIfBunkedAlot updatedPunishmentIfBunkedAlot  = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot("TestID", "TestName2", "TestLastName", "TestEmail");
        punishmentIfBunkedAlotRepository.update(updatedPunishmentIfBunkedAlot);
        Assert.assertNotEquals(punishmentIfBunkedAlot.getFirstName(), updatedPunishmentIfBunkedAlot.getFirstName());
        System.out.println(punishmentIfBunkedAlotRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(punishmentIfBunkedAlotRepository.getAll());
        punishmentIfBunkedAlotRepository.delete(punishmentIfBunkedAlot.getUserID());
        PunishmentIfBunkedAlot punishmentIfBunkedAlotTor = punishmentIfBunkedAlotRepository.read(punishmentIfBunkedAlot.getUserID());
        assertNull(punishmentIfBunkedAlotTor);
        System.out.println(punishmentIfBunkedAlotRepository.getAll());

    }
}