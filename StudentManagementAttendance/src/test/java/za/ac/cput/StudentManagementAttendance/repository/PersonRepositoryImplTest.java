package za.ac.cput.StudentManagementAttendance.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.Lecturer;
import za.ac.cput.StudentManagementAttendance.domain.Person;
import za.ac.cput.StudentManagementAttendance.repository.impl.LecturerRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.PersonRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.LecturerRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.PersonRepository;

import java.util.Set;

public class PersonRepositoryImplTest {

    private PersonRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = PersonRepositoryImpl.getRepository();
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
        Set<Person> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}