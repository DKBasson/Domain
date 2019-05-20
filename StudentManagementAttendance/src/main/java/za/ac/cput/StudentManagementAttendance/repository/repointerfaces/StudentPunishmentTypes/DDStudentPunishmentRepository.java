package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface DDStudentPunishmentRepository extends IRepository<DDStudentPunishment, String> {
    Set<DDStudentPunishment> getAll();

}
