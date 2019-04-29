package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface MDStudentRepository extends IRepository<MDStudent, String> {
    Set<MDStudent> getAll();

}