package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.HODFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.HODRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.HODRepository;


import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HODRepositoryImplTest {
    private HODRepository repository;
    private HOD course;

    private HOD getSavedCourse() {
        Set<HOD> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = HODRepositoryImpl.getRepository();
        this.course = HODFactory.getHOD("TestName",  "TestSurname", "216183006");
    }

    @Test
    public void a_create() {
        HOD created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        HOD savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getMemberID());
        HOD read = this.repository.read(savedCourse.getMemberID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        HOD savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getMemberID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        HOD course = new HOD.Builder().copy(getSavedCourse()).memberID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        HOD updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getMemberID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<HOD> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}