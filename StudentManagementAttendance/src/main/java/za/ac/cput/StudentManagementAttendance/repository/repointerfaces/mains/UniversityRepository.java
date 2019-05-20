package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface UniversityRepository extends IRepository<University, String> {
    Set<University> getAll();

}
