package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface DDStudentPunishmentService extends IService<DDStudentPunishment,String> {
    Set<DDStudentPunishment> getAll();
}