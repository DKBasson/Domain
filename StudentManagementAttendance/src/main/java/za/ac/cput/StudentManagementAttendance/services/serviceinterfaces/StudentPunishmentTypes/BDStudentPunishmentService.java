package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.BDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface BDStudentPunishmentService extends IService<BDStudentPunishment,String> {
    Set<BDStudentPunishment> getAll();
}