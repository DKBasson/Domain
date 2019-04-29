package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Lecturer;
import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.HashSet;
import java.util.Set;

public interface LecturerRepository extends IRepository<Lecturer, String> {
    Set<Lecturer> getAll();

}
