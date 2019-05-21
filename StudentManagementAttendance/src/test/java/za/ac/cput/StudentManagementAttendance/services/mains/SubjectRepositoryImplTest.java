package za.ac.cput.StudentManagementAttendance.services.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.SubjectFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.SubjectRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.SubjectRepository;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubjectRepositoryImplTest {
    private SubjectRepository repository;
    private Subject course;

    private Subject getSavedCourse() {
        Set<Subject> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = SubjectRepositoryImpl.getRepository();
        this.course = SubjectFactory.getSubject("TestName",   "216183006");
    }

    @Test
    public void a_create() {
        Subject created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Subject savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getSubjectID());
        Subject read = this.repository.read(savedCourse.getSubjectID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Subject savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getSubjectID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        Subject course = new Subject.Builder().copy(getSavedCourse()).subjectID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Subject updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getSubjectID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Subject> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}