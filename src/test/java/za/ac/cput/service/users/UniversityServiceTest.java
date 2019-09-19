package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.University;
import za.ac.cput.factory.users.UniversityFactory;
import za.ac.cput.service.users.impl.UniversityServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UniversityServiceTest {

    @Autowired
    private UniversityServiceImpl universityService;
    University university = UniversityFactory.getUniversity("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        universityService.create(university);

        assertNotNull(universityService.getAll());
        System.out.println(universityService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(universityService.getAll());

        University university1 = universityService.read(university.getUniversityID());

        assertEquals(university, university1);
        System.out.println(universityService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(universityService.getAll());

        University university1 = UniversityFactory.getUniversity("TestID", "TestName2", "TestLastName", "TestEmail");
        university1.setUniversityID(university.getUniversityID());
        universityService.update(university1);

        University university2 = universityService.read(university1.getUniversityID());

        assertEquals(university1, university2);
        System.out.println(universityService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(universityService.getAll());

        universityService.delete(university.getUniversityID());

        University notInSet = universityService.read(university.getUniversityID());

        assertNull(notInSet);
        System.out.println(universityService.getAll());





    }
}