package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.HOD;
import za.ac.cput.factory.users.HODFactory;
import za.ac.cput.repository.users.impl.HODRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HODRepositoryTest {

    @Autowired
    private HODRepositoryImpl hodRepository;
    HOD hod = HODFactory.getHOD("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        hodRepository.create(hod);
        assertNotNull(hodRepository.getAll());
        System.out.println(hodRepository.getAll());

    }

    @Test
    public void b_read() {

        HOD fromSet = hodRepository.read(hod.getUserID());
        assertEquals(hod, fromSet);
        System.out.println(hodRepository.getAll());
    }

    @Test
    public void c_update() {


        HOD updatedHOD  = HODFactory.getHOD("TestID", "TestName2", "TestLastName", "TestEmail");
        hodRepository.update(updatedHOD);
        Assert.assertNotEquals(hod.getFirstName(), updatedHOD.getFirstName());
        System.out.println(hodRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(hodRepository.getAll());
        hodRepository.delete(hod.getUserID());
        HOD hodTor = hodRepository.read(hod.getUserID());
        assertNull(hodTor);
        System.out.println(hodRepository.getAll());

    }
}