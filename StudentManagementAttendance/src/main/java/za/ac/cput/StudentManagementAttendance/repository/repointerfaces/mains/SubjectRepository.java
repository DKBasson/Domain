package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface SubjectRepository extends IRepository<Subject, String> {
    Set<Subject> getAll();

}
