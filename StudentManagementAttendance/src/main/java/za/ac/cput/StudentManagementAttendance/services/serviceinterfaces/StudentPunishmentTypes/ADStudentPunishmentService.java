package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.ADStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface ADStudentPunishmentService extends IService<ADStudentPunishment,String> {
    Set<ADStudentPunishment> getAll();
}