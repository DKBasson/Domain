package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Set<Student> getAll();
}