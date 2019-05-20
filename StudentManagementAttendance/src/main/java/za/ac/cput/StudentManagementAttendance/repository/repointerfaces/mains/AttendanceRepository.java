package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Attendance;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface AttendanceRepository extends IRepository<Attendance, String> {
    Set<Attendance> getAll();

}
