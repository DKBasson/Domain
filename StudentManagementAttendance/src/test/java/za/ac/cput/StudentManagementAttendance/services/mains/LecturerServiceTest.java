package za.ac.cput.StudentManagementAttendance.services.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.LecturerFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.LecturerRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.LecturerRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LecturerServiceTest {
    private LecturerRepository repository;
    private Lecturer course;

    private Lecturer getSavedCourse() {
        Set<Lecturer> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = LecturerRepositoryImpl.getRepository();
        this.course = LecturerFactory.getLecturer("TestName",  "TestSurname", "216183006");
    }

    @Test
    public void a_create() {
        Lecturer created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Lecturer savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getStaffID());
        Lecturer read = this.repository.read(savedCourse.getStaffID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Lecturer savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getStaffID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        Lecturer course = new Lecturer.Builder().copy(getSavedCourse()).staffID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Lecturer updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getStaffID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Lecturer> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}