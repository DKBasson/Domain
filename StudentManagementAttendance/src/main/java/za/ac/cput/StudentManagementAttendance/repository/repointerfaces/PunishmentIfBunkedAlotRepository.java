package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.domain.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface PunishmentIfBunkedAlotRepository extends IRepository<PunishmentIfBunkedAlot, String> {
    Set<PunishmentIfBunkedAlot> getAll();

}
