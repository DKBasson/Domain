package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ADStudentPunishmentRepository extends IRepository<ADStudentPunishment, String> {
    Set<ADStudentPunishment> getAll();

}
