package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface BDStudentPunishmentRepository extends IRepository<BDStudentPunishment, String> {
        Set<BDStudentPunishment> getAll();

        }
