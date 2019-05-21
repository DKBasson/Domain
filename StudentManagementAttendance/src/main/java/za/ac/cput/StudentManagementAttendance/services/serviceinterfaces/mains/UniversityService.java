package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.University;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface UniversityService extends IService<University,String> {
    Set<University> getAll();
}