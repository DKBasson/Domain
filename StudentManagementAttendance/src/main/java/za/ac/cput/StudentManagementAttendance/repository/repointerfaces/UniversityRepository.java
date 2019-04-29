package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.domain.University;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public interface UniversityRepository extends IRepository<University, String> {
    Set<University> getAll();

}
