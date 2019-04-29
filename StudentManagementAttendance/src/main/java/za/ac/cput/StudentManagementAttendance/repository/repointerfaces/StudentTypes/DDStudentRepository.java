package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface DDStudentRepository extends IRepository<DDStudent, String> {
    Set<DDStudent> getAll();

}