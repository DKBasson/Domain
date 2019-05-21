package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.PunishmentIfBunkedAlot;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface PunishmentIfBunkedAlotService extends IService<PunishmentIfBunkedAlot,String> {
    Set<PunishmentIfBunkedAlot> getAll();
}