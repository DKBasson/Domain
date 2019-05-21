package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Lecturer;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface LecturerService extends IService<Lecturer,String> {
    Set<Lecturer> getAll();
}