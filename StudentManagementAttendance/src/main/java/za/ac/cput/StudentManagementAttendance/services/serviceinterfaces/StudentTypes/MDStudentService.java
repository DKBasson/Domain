package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface MDStudentService extends IService<MDStudent,String> {
    Set<MDStudent> getAll();
}