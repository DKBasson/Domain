package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Venue;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.VenueFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.VenueRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.VenueRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VenueRepositoryImplTest {
    private VenueRepository repository;
    private Venue course;

    private Venue getSavedCourse() {
        Set<Venue> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = VenueRepositoryImpl.getRepository();
        this.course = VenueFactory.getVenue("216183006");
    }

    @Test
    public void a_create() {
        Venue created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Venue savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getVenueNumber());
        Venue read = this.repository.read(savedCourse.getVenueNumber());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Venue savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getVenueNumber());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        Venue course = new Venue.Builder().copy(getSavedCourse()).venueNumber(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Venue updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getVenueNumber());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Venue> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
