package za.ac.cput.StudentManagementAttendance.services.serviceinterfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.services.IService;

import java.util.Set;

public interface AdministratorService extends IService<Administrator,String> {
    Set<Administrator> getAll();
}