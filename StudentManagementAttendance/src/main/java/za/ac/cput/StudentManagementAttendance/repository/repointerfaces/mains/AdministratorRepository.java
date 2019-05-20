package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.Administrator;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface AdministratorRepository extends IRepository<Administrator, String> {
    Set<Administrator> getAll();

}
