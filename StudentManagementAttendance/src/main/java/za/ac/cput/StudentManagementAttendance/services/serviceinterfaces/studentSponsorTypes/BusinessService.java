package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.studentSponsorTypes.Business;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface BusinessService extends IService<Business,String> {
    Set<Business> getAll();
}