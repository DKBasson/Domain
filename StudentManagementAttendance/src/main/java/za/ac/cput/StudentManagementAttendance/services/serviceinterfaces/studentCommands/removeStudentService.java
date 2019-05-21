package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.removeStudent;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface removeStudentService extends IService<removeStudent,String> {
    Set<removeStudent> getAll();
}