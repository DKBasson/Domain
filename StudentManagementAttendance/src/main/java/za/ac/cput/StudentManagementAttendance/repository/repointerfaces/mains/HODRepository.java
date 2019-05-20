package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.HOD;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface HODRepository extends IRepository<HOD, String> {
    Set<HOD> getAll();

}
