package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface AttendanceService extends IService<Attendance,String> {
    Set<Attendance> getAll();
}