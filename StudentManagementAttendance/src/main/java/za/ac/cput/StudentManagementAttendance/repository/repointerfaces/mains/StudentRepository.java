package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
