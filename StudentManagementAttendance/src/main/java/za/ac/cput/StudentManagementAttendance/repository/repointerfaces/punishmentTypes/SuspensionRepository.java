package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface SuspensionRepository extends IRepository<SuspensionRepository, String> {
    Set<SuspensionRepository> getAll();

}
