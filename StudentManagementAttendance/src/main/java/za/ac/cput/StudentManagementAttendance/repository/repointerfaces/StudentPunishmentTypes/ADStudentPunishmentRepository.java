package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ADStudentPunishmentRepository extends IRepository<ADStudentPunishmentRepository, String> {
    Set<ADStudentPunishmentRepository> getAll();

}
