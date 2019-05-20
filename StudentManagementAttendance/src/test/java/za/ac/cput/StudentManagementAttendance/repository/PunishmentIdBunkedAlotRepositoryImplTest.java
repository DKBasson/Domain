package za.ac.cput.StudentManagementAttendance.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.Set;

public class PunishmentIdBunkedAlotRepositoryImplTest {

    private StudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Student> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
