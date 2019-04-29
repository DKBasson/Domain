package za.ac.cput.StudentManagementAttendance.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.University;
import za.ac.cput.StudentManagementAttendance.domain.Venue;
import za.ac.cput.StudentManagementAttendance.repository.impl.UniversityRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.VenueRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.UniversityRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.VenueRepository;

import java.util.Set;

public class VenueRepositoryImplTest {

    private VenueRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = VenueRepositoryImpl.getRepository();
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
        Set<Venue> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
