package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface BDStudentRepository extends IRepository<BDStudent, String> {
    Set<BDStudent> getAll();

}