package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface BDStudentPunishmentRepository extends IRepository<BDStudentPunishmentRepository, String> {
        Set<BDStudentPunishmentRepository> getAll();

        }
