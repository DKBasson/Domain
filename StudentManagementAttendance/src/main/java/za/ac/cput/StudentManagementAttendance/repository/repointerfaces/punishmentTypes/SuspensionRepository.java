package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface SuspensionRepository extends IRepository<Suspension, String> {
    Set<Suspension> getAll();

}
