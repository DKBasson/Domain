package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface DADStudentPunishmentRepository extends IRepository<DADStudentPunishmentRepository, String> {
    Set<DADStudentPunishmentRepository> getAll();

}
