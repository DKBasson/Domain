package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.punishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.punishmentTypes.Expulsion;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface ExpulsionService extends IService<Expulsion,String> {
    Set<Expulsion> getAll();
}