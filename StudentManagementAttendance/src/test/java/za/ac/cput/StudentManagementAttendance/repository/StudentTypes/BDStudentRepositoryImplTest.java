package za.ac.cput.StudentManagementAttendance.repository.StudentTypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.BDStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.BDStudentRepository;

import java.util.Set;

public class BDStudentRepositoryImplTest {

    private BDStudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = BDStudentRepositoryImpl.getRepository();
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
        Set<BDStudent> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
