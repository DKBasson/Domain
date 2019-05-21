package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Subject;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface SubjectService extends IService<Subject,String> {
    Set<Subject> getAll();
}