package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.DDStudent;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface DDStudentService extends IService<DDStudent,String> {
    Set<DDStudent> getAll();
}