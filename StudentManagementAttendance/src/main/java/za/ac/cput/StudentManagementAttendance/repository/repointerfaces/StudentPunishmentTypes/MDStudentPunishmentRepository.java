package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface MDStudentPunishmentRepository extends IRepository<MDStudentPunishment, String> {
    Set<MDStudentPunishment> getAll();

}
