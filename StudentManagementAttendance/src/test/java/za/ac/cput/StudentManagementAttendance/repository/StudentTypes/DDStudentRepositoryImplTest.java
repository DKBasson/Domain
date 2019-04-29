package za.ac.cput.StudentManagementAttendance.repository.StudentTypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.ADStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.DDStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.ADStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.DDStudentRepository;

import java.util.Set;

public class DDStudentRepositoryImplTest {

    private DDStudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = DDStudentRepositoryImpl.getRepository();
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
        Set<DDStudent> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
