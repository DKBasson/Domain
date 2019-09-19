package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.University;
import za.ac.cput.factory.users.UniversityFactory;
import za.ac.cput.repository.users.impl.UniversityRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UniversityRepositoryTest {

    @Autowired
    private UniversityRepositoryImpl universityRepository;
    University university = UniversityFactory.getUniversity("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        universityRepository.create(university);
        assertNotNull(universityRepository.getAll());
        System.out.println(universityRepository.getAll());

    }

    @Test
    public void b_read() {

        University fromSet = universityRepository.read(university.getUniversityID());
        assertEquals(university, fromSet);
        System.out.println(universityRepository.getAll());
    }

    @Test
    public void c_update() {


        University updatedUniversity  = UniversityFactory.getUniversity("TestID", "TestName2", "TestLastName", "TestEmail");
        universityRepository.update(updatedUniversity);
        Assert.assertNotEquals(university.getUniversityName(), updatedUniversity.getUniversityName());
        System.out.println(universityRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(universityRepository.getAll());
        universityRepository.delete(university.getUniversityID());
        University universityTor = universityRepository.read(university.getUniversityID());
        assertNull(universityTor);
        System.out.println(universityRepository.getAll());

    }
}