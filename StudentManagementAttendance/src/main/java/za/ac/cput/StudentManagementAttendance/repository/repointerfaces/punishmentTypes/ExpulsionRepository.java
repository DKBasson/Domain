package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ExpulsionRepository extends IRepository<ExpulsionRepository, String> {
    Set<ExpulsionRepository> getAll();

}
