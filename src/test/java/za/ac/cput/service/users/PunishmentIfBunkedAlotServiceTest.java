package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.PunishmentIfBunkedAlot;
import za.ac.cput.factory.users.PunishmentIfBunkedAlotFactory;
import za.ac.cput.service.users.impl.PunishmentIfBunkedAlotServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PunishmentIfBunkedAlotServiceTest {

    @Autowired
    private PunishmentIfBunkedAlotServiceImpl punishmentIfBunkedAlotService;
    PunishmentIfBunkedAlot punishmentIfBunkedAlot = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        punishmentIfBunkedAlotService.create(punishmentIfBunkedAlot);

        assertNotNull(punishmentIfBunkedAlotService.getAll());
        System.out.println(punishmentIfBunkedAlotService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(punishmentIfBunkedAlotService.getAll());

        PunishmentIfBunkedAlot punishmentIfBunkedAlot1 = punishmentIfBunkedAlotService.read(punishmentIfBunkedAlot.getUserID());

        assertEquals(punishmentIfBunkedAlot, punishmentIfBunkedAlot1);
        System.out.println(punishmentIfBunkedAlotService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(punishmentIfBunkedAlotService.getAll());

        PunishmentIfBunkedAlot punishmentIfBunkedAlot1 = PunishmentIfBunkedAlotFactory.getPunishmentIfBunkedAlot("TestID", "TestName2", "TestLastName", "TestEmail");
        punishmentIfBunkedAlot1.setUserID(punishmentIfBunkedAlot.getUserID());
        punishmentIfBunkedAlotService.update(punishmentIfBunkedAlot1);

        PunishmentIfBunkedAlot punishmentIfBunkedAlot2 = punishmentIfBunkedAlotService.read(punishmentIfBunkedAlot1.getUserID());

        assertEquals(punishmentIfBunkedAlot1, punishmentIfBunkedAlot2);
        System.out.println(punishmentIfBunkedAlotService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(punishmentIfBunkedAlotService.getAll());

        punishmentIfBunkedAlotService.delete(punishmentIfBunkedAlot.getUserID());

        PunishmentIfBunkedAlot notInSet = punishmentIfBunkedAlotService.read(punishmentIfBunkedAlot.getUserID());

        assertNull(notInSet);
        System.out.println(punishmentIfBunkedAlotService.getAll());





    }
}