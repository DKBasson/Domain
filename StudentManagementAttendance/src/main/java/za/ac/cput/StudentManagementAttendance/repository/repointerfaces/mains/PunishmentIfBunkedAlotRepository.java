package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface PunishmentIfBunkedAlotRepository extends IRepository<PunishmentIfBunkedAlot, String> {
    Set<PunishmentIfBunkedAlot> getAll();

}
