package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PunishmentIfBunkedAlotFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.PunishmentIfBunkedAlotRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PunishmentIfBunkedAlotRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PunishmentIdBunkedAlotRepositoryImplTest {
    private PunishmentIfBunkedAlotRepository repository;
    private PunishmentIfBunkedAlot course;

    private PunishmentIfBunkedAlot getSavedCourse() {
        Set<PunishmentIfBunkedAlot> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PunishmentIfBunkedAlotRepositoryImpl.getRepository();
        this.course = PunishmentIfBunkedAlotFactory.getPunishment("TestName",  "TestSurname");
    }

    @Test
    public void a_create() {
        PunishmentIfBunkedAlot created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        PunishmentIfBunkedAlot savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getStudentID());
        PunishmentIfBunkedAlot read = this.repository.read(savedCourse.getStudentID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        PunishmentIfBunkedAlot savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getStudentID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "TestName";
        PunishmentIfBunkedAlot course = new PunishmentIfBunkedAlot.Builder().copy(getSavedCourse()).studentID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        PunishmentIfBunkedAlot updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getStudentID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<PunishmentIfBunkedAlot> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}