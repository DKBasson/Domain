package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Parent;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface ParentService extends IService<Parent,String> {
    Set<Parent> getAll();
}