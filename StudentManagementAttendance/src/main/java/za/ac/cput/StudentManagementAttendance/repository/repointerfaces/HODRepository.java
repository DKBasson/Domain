package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface HODRepository extends IRepository<HOD, String> {
    Set<HOD> getAll();

}
