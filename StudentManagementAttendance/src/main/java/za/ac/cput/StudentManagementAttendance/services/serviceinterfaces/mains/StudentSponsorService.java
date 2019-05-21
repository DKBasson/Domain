package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface StudentSponsorService extends IService<StudentSponsor,String> {
    Set<StudentSponsor> getAll();
}