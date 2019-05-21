package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface ADStudentService extends IService<ADStudent,String> {
    Set<ADStudent> getAll();
}