package za.ac.cput.StudentManagementAttendance.repository.StudentTypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.MDStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.MDStudentRepository;

import java.util.Set;

public class MDStudentRepositoryImplTest {

    private MDStudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = MDStudentRepositoryImpl.getRepository();
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
        Set<MDStudent> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
