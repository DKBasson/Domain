package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.UniversityFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.UniversityRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.UniversityRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UniversityRepositoryImplTest {
    private UniversityRepository repository;
    private University course;

    private University getSavedCourse() {
        Set<University> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UniversityRepositoryImpl.getRepository();
        this.course = UniversityFactory.getUniversity("TestName",  "TestSurname", "216183006");
    }

    @Test
    public void a_create() {
        University created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        University savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getUniversityID());
        University read = this.repository.read(savedCourse.getUniversityID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        University savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getUniversityID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        University course = new University.Builder().copy(getSavedCourse()).universityID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        University updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getUniversityID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<University> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}