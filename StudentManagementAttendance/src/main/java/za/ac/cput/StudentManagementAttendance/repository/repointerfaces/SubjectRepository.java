package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.Subject;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface SubjectRepository extends IRepository<Subject, String> {
    Set<Subject> getAll();

}
