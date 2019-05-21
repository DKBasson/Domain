package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.StudentFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryImplTest {

    private StudentRepository repository;
    private Student course;

    private Student getSavedCourse() {
        Set<Student> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
        this.course = StudentFactory.getStudent("TestName", "TestSurname", "03/04/2019", "216183006", 78);
    }

    @Test
    public void a_create() {
        Student created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Student savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getSsStudentNum());
        Student read = this.repository.read(savedCourse.getSsStudentNum());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Student savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getSsStudentNum());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "TestName";
        Student course = new Student.Builder().copy(getSavedCourse()).sName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Student updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getsName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Student> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
