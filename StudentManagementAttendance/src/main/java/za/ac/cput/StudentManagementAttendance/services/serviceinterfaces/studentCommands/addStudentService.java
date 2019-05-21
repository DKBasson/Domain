package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.studentCommands.addStudent;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface addStudentService extends IService<addStudent,String> {
    Set<addStudent> getAll();
}