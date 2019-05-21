package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AdministratorFactory;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.StudentFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.AdministratorRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AdministratorRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdministratorRepositoryImplTest {

    private AdministratorRepository repository;
    private Administrator course;

    private Administrator getSavedCourse() {
        Set<Administrator> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AdministratorRepositoryImpl.getRepository();
        this.course = AdministratorFactory.getAdministrator("TestName", "TestSurname", "216183006");
    }

    @Test
    public void a_create() {
        Administrator created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Administrator savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getStaffID());
        Administrator read = this.repository.read(savedCourse.getStaffID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Administrator savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getStaffID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "TestName";
        Administrator course = new Administrator.Builder().copy(getSavedCourse()).administratorName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Administrator updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getAdministratorNameName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Administrator> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
