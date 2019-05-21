package za.ac.cput.StudentManagementAttendance.repository.mains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AdministratorFactory;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.AttendanceFactory;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.AdministratorRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.AttendanceRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.impl.mains.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AdministratorRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.AttendanceRepository;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains.StudentRepository;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttendanceRepositoryImplTest {
    private AttendanceRepository repository;
    private Attendance course;

    private Attendance getSavedCourse() {
        Set<Attendance> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AttendanceRepositoryImpl.getRepository();
        this.course = AttendanceFactory.getAttendance("216183006",  71);
    }

    @Test
    public void a_create() {
        Attendance created = this.repository.create(this.course);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.course);
    }

    @Test
    public void b_read() {
        Attendance savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getStudentID());
        Attendance read = this.repository.read(savedCourse.getStudentID());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Attendance savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getStudentID());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "216183006";
        Attendance course = new Attendance.Builder().copy(getSavedCourse()).studentID(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Attendance updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getStudentID());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Attendance> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}