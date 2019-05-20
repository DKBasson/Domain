package za.ac.cput.StudentManagementAttendance.repository.StudentTypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.ADStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;

import java.util.Set;

public class ADStudentRepositoryImplTest {

    private ADStudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = ADStudentRepositoryImpl.getRepository();
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
        Set<ADStudent> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
