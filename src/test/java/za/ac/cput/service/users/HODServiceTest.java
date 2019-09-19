package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.factory.users.HODFactory;
import za.ac.cput.service.users.impl.HODServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HODServiceTest {

    @Autowired
    private HODServiceImpl hodService;
    HOD hod = HODFactory.getHOD("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        hodService.create(hod);

        assertNotNull(hodService.getAll());
        System.out.println(hodService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(hodService.getAll());

        HOD hod1 = hodService.read(hod.getUserID());

        assertEquals(hod, hod1);
        System.out.println(hodService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(hodService.getAll());

        HOD hod1 = HODFactory.getHOD("TestID", "TestName2", "TestLastName", "TestEmail");
        hod1.setUserID(hod.getUserID());
        hodService.update(hod1);

        HOD hod2 = hodService.read(hod1.getUserID());

        assertEquals(hod1, hod2);
        System.out.println(hodService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(hodService.getAll());

        hodService.delete(hod.getUserID());

        HOD notInSet = hodService.read(hod.getUserID());

        assertNull(notInSet);
        System.out.println(hodService.getAll());





    }
}