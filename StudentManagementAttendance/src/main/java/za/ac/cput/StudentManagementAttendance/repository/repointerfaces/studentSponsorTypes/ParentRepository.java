package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.studentSponsorTypes;

import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface ParentRepository extends IRepository<ParentRepository, String> {
    Set<ParentRepository> getAll();

}
