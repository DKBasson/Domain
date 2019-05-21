package za.ac.cput.StudentManagementAttendance.repository.StudentTypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.domain.mains.Person;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.PersonFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentTypes.DDStudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.PersonRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes.DDStudentRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.PersonRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DDStudentRepositoryImplTest {
    private PersonRepository repository;
    private Person course;

    private Person getSavedCourse() {
        Set<Person> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PersonRepositoryImpl.getRepository();
        this.course = PersonFactory.getPerson("TestName",  "TestSurname");
    }

    @Test
    public void a_create() {
        Person created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Person savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getPersonName());
        Person read = this.repository.read(savedCourse.getPersonName());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Person savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getPersonName());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "TestName";
        Person course = new Person.Builder().copy(getSavedCourse()).personName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Person updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getPersonName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Person> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
