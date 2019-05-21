package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Suspension;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface SuspensionService extends IService<Suspension,String> {
    Set<Suspension> getAll();
}