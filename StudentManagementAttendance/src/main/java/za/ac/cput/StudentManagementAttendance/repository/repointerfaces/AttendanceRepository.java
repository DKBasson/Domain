package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Attendance;
import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface AttendanceRepository extends IRepository<Attendance, String> {
    Set<Attendance> getAll();

}
