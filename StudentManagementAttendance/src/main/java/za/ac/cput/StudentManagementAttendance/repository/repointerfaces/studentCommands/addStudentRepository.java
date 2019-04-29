package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentCommands;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface addStudentRepository extends IRepository<addStudentRepository, String> {
    Set<addStudentRepository> getAll();

}
