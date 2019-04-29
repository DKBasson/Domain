package za.ac.cput.StudentManagementAttendance.repository.repointerfaces;

import za.ac.cput.StudentManagementAttendance.domain.Administrator;
import za.ac.cput.StudentManagementAttendance.domain.HOD;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface AdministratorRepository extends IRepository<Administrator, String> {
    Set<Administrator> getAll();

}
