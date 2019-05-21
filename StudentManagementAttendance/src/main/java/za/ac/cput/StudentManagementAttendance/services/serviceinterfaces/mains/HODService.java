package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface HODService extends IService<HOD,String> {
    Set<HOD> getAll();
}