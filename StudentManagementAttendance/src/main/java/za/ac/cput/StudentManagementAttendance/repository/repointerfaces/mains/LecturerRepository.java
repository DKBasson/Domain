package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface LecturerRepository extends IRepository<Lecturer, String> {
    Set<Lecturer> getAll();

}
