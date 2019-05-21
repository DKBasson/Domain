package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.StudentTypes;

import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface BDStudentService extends IService<BDStudent,String> {
    Set<BDStudent> getAll();
}