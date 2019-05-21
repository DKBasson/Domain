package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.MDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface MDStudentPunishmentService extends IService<MDStudentPunishment,String> {
    Set<MDStudentPunishment> getAll();
}