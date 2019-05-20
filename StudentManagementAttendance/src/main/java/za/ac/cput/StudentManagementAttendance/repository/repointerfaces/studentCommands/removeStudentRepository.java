package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface removeStudentRepository extends IRepository<removeStudent, String> {
    Set<removeStudent> getAll();

}
