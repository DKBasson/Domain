package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ExpulsionRepository extends IRepository<Expulsion, String> {
    Set<Expulsion> getAll();

}
